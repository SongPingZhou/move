package com.itheima.entity;

public class News {
    private Integer id;

    private String newtitle;

    private String newbody;

    private Integer click;

    private String releasetime;

    private String newimg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewtitle() {
        return newtitle;
    }

    public void setNewtitle(String newtitle) {
        this.newtitle = newtitle == null ? null : newtitle.trim();
    }

    public String getNewbody() {
        return newbody;
    }

    public void setNewbody(String newbody) {
        this.newbody = newbody == null ? null : newbody.trim();
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public String getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(String releasetime) {
        this.releasetime = releasetime == null ? null : releasetime.trim();
    }

    public String getNewimg() {
        return newimg;
    }

    public void setNewimg(String newimg) {
        this.newimg = newimg == null ? null : newimg.trim();
    }
}