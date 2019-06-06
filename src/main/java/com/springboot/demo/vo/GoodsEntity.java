package com.springboot.demo.vo;

import javax.persistence.*;

/**
 * Created by ${zhuyuping} on 2019/6/4 0004.
 */
@Entity
@Table(name = "goods")
public class GoodsEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="goods_id")
    private Integer goodsId;
//商品价格
    @Column(name="goods_price")
    private double goodsInPrice;
//商品介绍
    @Lob
    @Column(name="goods_introduction")
    private String goodsIntroduction;
//商品数量
    @Column(name="goods_num")
    private int goodsNum;
//商品编号
    @Column(name="goods_number")
    private String goodsNumber;

//商品名称名称
    @Column(name="goods_name")
    private String goodsName;
    //商品类型
    @ManyToOne
    @JoinColumn(name="goods_type_id")
    private GoodsTypeEntity goodsTypeEntity;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public double getGoodsInPrice() {
        return goodsInPrice;
    }

    public void setGoodsInPrice(double goodsInPrice) {
        this.goodsInPrice = goodsInPrice;
    }

    public String getGoodsIntroduction() {
        return goodsIntroduction;
    }

    public void setGoodsIntroduction(String goodsIntroduction) {
        this.goodsIntroduction = goodsIntroduction;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public GoodsTypeEntity getGoodsTypeEntity() {
        return goodsTypeEntity;
    }

    public void setGoodsTypeEntity(GoodsTypeEntity goodsTypeEntity) {
        this.goodsTypeEntity = goodsTypeEntity;
    }

    @Override
    public String toString() {
        return "GoodsEntity{" +
                "goodsId=" + goodsId +
                ", goodsInPrice=" + goodsInPrice +
                ", goodsIntroduction='" + goodsIntroduction + '\'' +
                ", goodsNum=" + goodsNum +
                ", goodsNumber='" + goodsNumber + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsTypeEntity=" + goodsTypeEntity +
                '}';
    }
}
