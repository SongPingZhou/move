package com.itheima.service.impl;

import com.itheima.entity.User;
import com.itheima.entity.UserExample;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;


    @Override
    public User login(String uname, String pwd) {
        User user = userMapper.selectByUserNameAndPwd(uname, pwd);
        return user;
    }

    /**
     * 1、判断当前登录的用户是否被限制登录
     *     1.1执行登录功能时：
     * 	（执行登录功能）
     * 	2.如果登录成功
     * 	   2.1登录成功--》（清除输入密码错误次数的信息）
     * 	   2.2登录不成功
     * 	      3.记录登陆错误次数
     * 	        (判断reids中的登录次数Key是否存在）
     *  	         3.1如果不存在
     * 		是第一次登录次数为1，user:loginCount:fail:用户名进行赋值，同时设置失效期
     * 	         3.2如果存在
     * 		查询登录失败次数key的结果
     * 		if(结果<4)
     * 		   user:loginCount:fail：+1
     * 		else{
     * 		   限制登录key存在 ，同时设置登录时间锁定1小时。
     *                }
     * 1.2如果被限制
     * 	相应提示
     */

    /**
     * 登录不成功的操作
     * @param uname 用户名
     * @return
     */
    @Override
    public String loginValdate(String uname) {
        //1、记录登录错误次数的key
        String key=User.getLoginCountFailKey(uname);
        int num=5;//登录错误次数
        if(!redisTemplate.hasKey(key)){//如果不存在
            //是第一次登录次数为1，user:loginCount:fail:用户名进行赋值，同时设置失效期
            redisTemplate.opsForValue().set(User.getLoginCountFailKey(uname),"1");//先赋值
            redisTemplate.expire(key,2,TimeUnit.MINUTES);//设置失效期两分钟  再设置
            return "登录失败，2分钟内还允许输入错误"+(num-1)+"次";
        }else{//如果存在
            //查询当前登录失败次数的key的结果
            long loginFailCount = Long.parseLong(redisTemplate.opsForValue().get(key));
            if(loginFailCount<(num-1)){
                //user:loginCount:fail:+1登录次数加1
                redisTemplate.opsForValue().increment(key,1);//对指定key增加指定数据
                Long seconds = redisTemplate.getExpire(key, TimeUnit.SECONDS);//返回的是秒
                return  "登录失败，在"+seconds+"秒内还允许输入错误"+(num-loginFailCount-1)+"次";
            }else{//超过了指定登录次数
                // 限制登录key存在 ，同时设置登录时间锁定1小时。
                redisTemplate.opsForValue().set(User.getLoginTimeLockKey(uname),"1");
                redisTemplate.expire(User.getLoginTimeLockKey(uname),1,TimeUnit.HOURS);
                return "因登录失败次数超过限制"+num+"次，已对其限制登录1小时";
            }
        }
    }


    /**
     * 判断当前登录的用户是否被限制登录
     * 查询当前key是否存在，如果存在直接限制 ：需要给用户进行提示：您当前已被限制，还剩多长时间
     * 如果不存在则就不限制
     * @param uname
     * @return
     */
    @Override
    public Map<String,Object> loginUserLock(String uname) {
        Map<String,Object> map=new HashMap<String,Object>();
        String key=User.getLoginTimeLockKey(uname);
        if(redisTemplate.hasKey(key)){
            Long lockTime = redisTemplate.getExpire(key, TimeUnit.MINUTES);//以分钟单位返回
            //如果存在返回信息 被限制
            map.put("flag",true);
            map.put("lockTime",lockTime);//还剩下多长时间（小时单位返回分钟）
        }else{
            map.put("flag",false);
        }
        return map;
    }

    @Override
    public Map<String,Object> signIn(String username, String password) {
        Map<String,Object> maps=new HashMap<String,Object>();
        maps.put("flag",false);
        //2.1判断当前用户是被限制登录
        Map<String, Object> map = loginUserLock(username);
        if((boolean)map.get("flag")){//为true 被限制登录
            maps.put("msg","登录失败，因"+username+"用户超过了限制登录次数，已被锁定。还剩："+map.get("lockTime")+"分钟");
            return maps;
        }else{//如果没有被限制登录
            //执行登录
            User login = login(username, password);
            //判断是否登录成功
            if(null!=login){//登录成功
                //清空对应的key
                maps.put("flag",true);
                redisTemplate.delete(User.getLoginCountFailKey(username));
                maps.put("msg",login.getId());
                return maps;
            }else{//登录不成功
                String result = loginValdate(username);
                maps.put("msg",result);
                return maps;
            }
        }

    }
}
