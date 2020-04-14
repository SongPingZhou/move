package com.itheima.entity;

import java.util.Date;

public class Orders {
    private Integer id;

    private Date orderdate;

    private Integer customerid;

    private Float totalmoney;

    private String status;

    private String shipname;

    private String shipnum;

    private Date shipdate;

    private String shipcountry;

    private String shipprovince;

    private String shipcity;

    private String shiptown;

    private String shipaddress;

    private String shippostcode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Float getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Float totalmoney) {
        this.totalmoney = totalmoney;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname == null ? null : shipname.trim();
    }

    public String getShipnum() {
        return shipnum;
    }

    public void setShipnum(String shipnum) {
        this.shipnum = shipnum == null ? null : shipnum.trim();
    }

    public Date getShipdate() {
        return shipdate;
    }

    public void setShipdate(Date shipdate) {
        this.shipdate = shipdate;
    }

    public String getShipcountry() {
        return shipcountry;
    }

    public void setShipcountry(String shipcountry) {
        this.shipcountry = shipcountry == null ? null : shipcountry.trim();
    }

    public String getShipprovince() {
        return shipprovince;
    }

    public void setShipprovince(String shipprovince) {
        this.shipprovince = shipprovince == null ? null : shipprovince.trim();
    }

    public String getShipcity() {
        return shipcity;
    }

    public void setShipcity(String shipcity) {
        this.shipcity = shipcity == null ? null : shipcity.trim();
    }

    public String getShiptown() {
        return shiptown;
    }

    public void setShiptown(String shiptown) {
        this.shiptown = shiptown == null ? null : shiptown.trim();
    }

    public String getShipaddress() {
        return shipaddress;
    }

    public void setShipaddress(String shipaddress) {
        this.shipaddress = shipaddress == null ? null : shipaddress.trim();
    }

    public String getShippostcode() {
        return shippostcode;
    }

    public void setShippostcode(String shippostcode) {
        this.shippostcode = shippostcode == null ? null : shippostcode.trim();
    }
}