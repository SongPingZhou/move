package com.itheima.entity;

public class Lunbo {
    private Integer id;

    private String wheelplantingimg;

    private String titlt;

    private String wheelplantingurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWheelplantingimg() {
        return wheelplantingimg;
    }

    public void setWheelplantingimg(String wheelplantingimg) {
        this.wheelplantingimg = wheelplantingimg == null ? null : wheelplantingimg.trim();
    }

    public String getTitlt() {
        return titlt;
    }

    public void setTitlt(String titlt) {
        this.titlt = titlt == null ? null : titlt.trim();
    }

    public String getWheelplantingurl() {
        return wheelplantingurl;
    }

    public void setWheelplantingurl(String wheelplantingurl) {
        this.wheelplantingurl = wheelplantingurl == null ? null : wheelplantingurl.trim();
    }
}