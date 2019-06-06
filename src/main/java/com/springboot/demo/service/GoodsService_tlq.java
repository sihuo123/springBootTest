package com.springboot.demo.service;

import com.springboot.demo.mapper.GoodsMapper_tlq;
import com.springboot.demo.vo.Goods_tlq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tanlq on 2019/6/5.
 */
@Service
public class GoodsService_tlq {

    @Autowired
    private GoodsMapper_tlq goodsMapper;

    public List<Goods_tlq> findAllGoods(){
        return goodsMapper.findAllGoods();
    }

    public Goods_tlq findById(int id){
        return goodsMapper.findById(id);
    }

    public int insertGoods(Goods_tlq goods){
        return goodsMapper.insertGoods(goods);
    }

    public int updateById(Goods_tlq goods){
        return goodsMapper.updateById(goods);
    }

    public int deleteById(int id){
        return goodsMapper.deleteById(id);
    }

    public int deleteByIds(int[] ids){
        return goodsMapper.deleteByIds(ids);
    }
}
