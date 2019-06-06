package com.springboot.demo.vo;

/**
 * Created by tanlq on 2019/6/5.
 */
public class Goods_tlq {
    //商品ID
    private Integer goodsId;
    //商品编号
    private String goodsNum;
    //商品名称
    private String goodsName;
    //商品价格
    private Double goodsPrice;
    //商品库存
    private Integer goodsInventory;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsInventory() {
        return goodsInventory;
    }

    public void setGoodsInventory(Integer goodsInventory) {
        this.goodsInventory = goodsInventory;
    }

    @Override
    public String toString() {
        return "Goods_tlq{" +
                "goodsId=" + goodsId +
                ", goodsNum='" + goodsNum + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsInventory=" + goodsInventory +
                '}';
    }
}
