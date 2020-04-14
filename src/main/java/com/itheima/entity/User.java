package com.itheima.entity;

public class User {
    private Integer id;

    private String username;

    private String userpassword;

    /**
     * 锁定限制登录key：user:loginTime:ock:用户名
     * @param uname
     * @return
     */
    public static String getLoginTimeLockKey(String uname){
        return "user:loginTime:lock:"+uname;
    }

    /**
     * 登录失败次数的key,user:loginCount:fail:用户名
     * @return
     */
    public static String getLoginCountFailKey(String uname){
        return "user:loginCount:fail:"+uname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }
}