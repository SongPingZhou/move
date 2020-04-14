package com.itheima.entity;

public class Productimage {
    private Integer id;

    private String productimageurl;

    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductimageurl() {
        return productimageurl;
    }

    public void setProductimageurl(String productimageurl) {
        this.productimageurl = productimageurl == null ? null : productimageurl.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}