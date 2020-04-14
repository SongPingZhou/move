package com.itheima.service;

import com.itheima.entity.User;

import java.util.Map;

public interface UserService {

    /**
     * 登录用户名和密码
     * @param username 登录名
     * @param pwd 密码
     * @return
     */
    public User login(String username,String pwd);


    //### TODO 用户在两分钟内 仅允许输入错误密码5次，入股超过次数，限制其登录一个小时
    /**
     *登录前的限制检查
     * @param uname 用户名
     * @return 给用户详细提示
     */
    public String loginValdate(String uname);


    /**
     * 判断当前登录的用户是否被限制登录
     * @param uname
     * @return
     */
    public Map<String,Object> loginUserLock(String uname);

    /**
     * 执行登录
     * @param username
     * @param pwd
     * @return
     */
    public Map<String,Object> signIn(String username,String pwd);
}
