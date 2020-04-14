package com.itheima.comtroller;

import com.itheima.entity.User;
import com.itheima.entity.UserExample;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import com.itheima.service.VerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;



    @Autowired
    private VerificationService verificationService;
    /**
     *
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @RequestMapping("login")
    public Map<String,Object> login(@RequestParam("username") final String username,
                        @RequestParam("password") final String password){

            return userService.signIn(username, password);

    }
    @RequestMapping("register")//
    public Map<String,Object> register(@RequestParam("username") final String username,
                                       @RequestParam("password") final String password,
                                       @RequestParam("valcode") final String valcode){
        /**
         * 1、验证码比较
         */
        Map<String, Object> map = verificationService.IsExistsCode(username, valcode);
        if(!(boolean)map.get("flag")){
            return map;
        }else {
            /**
             * 2、执行登录功能
             * 2.1先判断当前用户是被限制登录
             */
            return userService.signIn(username, password);
        }
    }

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("selectUserById")
    public User selectUserById(@RequestParam("uid") Integer uid){
        User user = userMapper.selectByPrimaryKey(uid);
        return user;
    }
}
