package com.itheima.entity;

public class Layoutimage {
    private Integer id;

    private String msrc;

    private String title;

    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsrc() {
        return msrc;
    }

    public void setMsrc(String msrc) {
        this.msrc = msrc == null ? null : msrc.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}