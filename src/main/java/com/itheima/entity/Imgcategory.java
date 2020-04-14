package com.itheima.entity;

public class Imgcategory {
    private Integer id;

    private String imgcategoryname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgcategoryname() {
        return imgcategoryname;
    }

    public void setImgcategoryname(String imgcategoryname) {
        this.imgcategoryname = imgcategoryname == null ? null : imgcategoryname.trim();
    }
}