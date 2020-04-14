package com.itheima.entity;

public class Colorsize {
    private Integer id;

    private Integer pid;

    private String colorname;

    private Integer colorcount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getColorname() {
        return colorname;
    }

    public void setColorname(String colorname) {
        this.colorname = colorname == null ? null : colorname.trim();
    }

    public Integer getColorcount() {
        return colorcount;
    }

    public void setColorcount(Integer colorcount) {
        this.colorcount = colorcount;
    }
}