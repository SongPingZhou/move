package com.itheima.entity;

public class Product {
    private Integer id;

    private String title;

    private String addtime;

    private String zhaiyao;

    private String click;

    private String imgurl;

    private String sellprice;

    private String marketprice;

    private Integer pid;

    private Integer quantityperunit;

    private String number;

    private  Integer stock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }

    public String getZhaiyao() {
        return zhaiyao;
    }

    public void setZhaiyao(String zhaiyao) {
        this.zhaiyao = zhaiyao == null ? null : zhaiyao.trim();
    }

    public String getClick() {
        return click;
    }

    public void setClick(String click) {
        this.click = click == null ? null : click.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getSellprice() {
        return sellprice;
    }

    public void setSellprice(String sellprice) {
        this.sellprice = sellprice == null ? null : sellprice.trim();
    }

    public String getMarketprice() {
        return marketprice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setMarketprice(String marketprice) {
        this.marketprice = marketprice == null ? null : marketprice.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getQuantityperunit() {
        return quantityperunit;
    }

    public void setQuantityperunit(Integer quantityperunit) {
        this.quantityperunit = quantityperunit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }
}