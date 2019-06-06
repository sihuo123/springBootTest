package com.springboot.demo.vo;

import java.util.Date;

/**
 * 商品类
 */
public class GoodsXf {
    /** 主键id */
    private int id;
    /** 商品序列号 */
    private int serNumber;
    /** 商品名称 */
    private String tradeName;
    /** 商品类别 */
    private String classify;
    /** 商品描述 */
    private String describe;
    /** 商品价格 */
    private double price;
    /** 创建时间 */
    private Date createTime;
    /** 修改时间 */
    private Date updateTime;

    public void setId(int id) {
        this.id = id;
    }

    public void setSerNumber(int serNumber) {
        this.serNumber = serNumber;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getId() {
        return id;
    }

    public int getSerNumber() {
        return serNumber;
    }

    public String getTradeName() {
        return tradeName;
    }

    public String getClassify() {
        return classify;
    }

    public String getDescribe() {
        return describe;
    }

    public double getPrice() {
        return price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public GoodsXf(){}

    public GoodsXf(int id, int serNumber, String tradeName, String classify, String describe, double price, Date createTime, Date updateTime) {
        this.id = id;
        this.serNumber = serNumber;
        this.tradeName = tradeName;
        this.classify = classify;
        this.describe = describe;
        this.price = price;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "GoodsXf{" +
                "id=" + id +
                ", serNumber=" + serNumber +
                ", tradeName='" + tradeName + '\'' +
                ", classify='" + classify + '\'' +
                ", describe='" + describe + '\'' +
                ", price=" + price +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
