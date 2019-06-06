package com.springboot.demo.vo;

import javax.naming.NamingEnumeration;
import javax.persistence.*;
import java.util.List;

/**
 * Created by ${zhuyuping} on 2019/6/4 0004.
 */
@Entity
@Table(name = "good_type")
public class GoodsTypeEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  Integer id;
    @Column(name = "good_type")
    private String goodType;
    @OneToMany(mappedBy = "goodsTypeEntity")
    private List<GoodsEntity> goodsEntity;

    public GoodsTypeEntity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<GoodsEntity> getGoodsEntity() {
        return goodsEntity;
    }

    public void setGoodsEntity(List<GoodsEntity> goodsEntity) {
        this.goodsEntity = goodsEntity;
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType;
    }

    @Override
    public String toString() {
        return "GoodsTypeEntity{" +
                "id=" + id +
                ", goodType='" + goodType + '\'' +
                ", goodsEntity=" + goodsEntity +
                '}';
    }
}
