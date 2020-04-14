package com.itheima.service.impl;

import com.itheima.service.VerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class VerificationServiceImpl implements VerificationService {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    /**
     * 前台获取的手机号和前台传的验证码
     * @param phone
     * @param code
     */
    @Override
    public Map<String,Object> IsExistsCode(String phone, String code) {
        Map<String,Object> map=new HashMap<String,Object>();
        if(redisTemplate.hasKey(phone)){//手机号收到验证码
            String yzm = redisTemplate.opsForValue().get(phone);//从redis获取验证码
            if(yzm.equals(code)){
                map.put("flag",true);
                map.put("msg","验证码正确");
            }else{
                map.put("flag",false);
                map.put("msg","验证码错误");
            }
        }else{//手机号没有进行接收验证码 或 验证码已失效
            map.put("flag",false);
            map.put("msg","验证码已失效或伟发送成功！请从新发送");
        }
        return  map;
    }
}
