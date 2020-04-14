package com.itheima.entity;

public class Imagecomment {
    private Integer id;

    private Integer imageid;

    private String commentbody;

    private String commenttime;

    private Integer commentuser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImageid() {
        return imageid;
    }

    public void setImageid(Integer imageid) {
        this.imageid = imageid;
    }

    public String getCommentbody() {
        return commentbody;
    }

    public void setCommentbody(String commentbody) {
        this.commentbody = commentbody == null ? null : commentbody.trim();
    }

    public String getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(String commenttime) {
        this.commenttime = commenttime == null ? null : commenttime.trim();
    }

    public Integer getCommentuser() {
        return commentuser;
    }

    public void setCommentuser(Integer commentuser) {
        this.commentuser = commentuser;
    }
}