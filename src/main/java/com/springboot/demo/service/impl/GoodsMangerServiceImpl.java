package com.springboot.demo.service.impl;

import com.springboot.demo.mapper.GoodMangerMapper;
import com.springboot.demo.service.GoodsMangerService;
import com.springboot.demo.vo.GoodsEntity;
import com.springboot.demo.vo.GoodsTypeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by ${zhuyuping} on 2019/6/4 0004.
 */
@Service
public class GoodsMangerServiceImpl implements GoodsMangerService {
    @Autowired
    private GoodMangerMapper goodMangerMapper;
    @Override
    public List<GoodsEntity> getGoodsList(String goodsNumber, String goodsName, String goodType) {
        return goodMangerMapper.findAllGoods(goodsNumber,goodsName,goodType);
    }

    @Override
    public int delGoods(Integer goodId) {
        return goodMangerMapper.delGoods(goodId);
    }

    @Override
    public int delGoodsList(int[] goodIds) {
        return goodMangerMapper.delGoodsList(goodIds);
    }

    @Override
    public int updateGoods(Integer goodsId) {
        return 0;
    }

    @Override
    public List<GoodsTypeEntity> getListGoodsType() {
        return goodMangerMapper.selectGoodsType();
    }

    @Override
    public int insertGoods(GoodsEntity goodsEntity) {
        return goodMangerMapper.insertGoods(goodsEntity);
    }

    public GoodsTypeEntity getTyepById(Integer id){
        return goodMangerMapper.selectGoodsTypeById(id);
    }

    @Override
    public int updateGoods(GoodsEntity goodsEntity) {
        return goodMangerMapper.updateGoods(goodsEntity);
    }

    @Override
    public GoodsEntity getOneGoods(Integer id) {
        return goodMangerMapper.findOneGoods(id);
    }
}
