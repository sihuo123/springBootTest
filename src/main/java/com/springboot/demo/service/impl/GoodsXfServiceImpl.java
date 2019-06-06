package com.springboot.demo.service.impl;

import com.springboot.demo.mapper.GoodsXfMapper;
import com.springboot.demo.service.GoodsXfService;
import com.springboot.demo.vo.GoodsXf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * service实现类.
 */
@Service
public class GoodsXfServiceImpl implements GoodsXfService {

    @Autowired
    private GoodsXfMapper goodsXfMapper;

    @Override
    public List<GoodsXf> getGoodsXfs() {
        return goodsXfMapper.getAll();
    }

    @Override
    public List<GoodsXf> getGoodsXfs(GoodsXf goodsXf) {
        return goodsXfMapper.getGoodsXfs(goodsXf);
    }

    @Override
    public int addGoodsXf(GoodsXf goodsXf) {
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if(hashCodeV < 0) {
            hashCodeV = - hashCodeV;
        }
        goodsXf.setSerNumber(hashCodeV%100000000);
        return goodsXfMapper.addGoodsXf(goodsXf);
    }

    @Override
    public int delGoodsXfByIds(int[] list) {
        return goodsXfMapper.delGoodsXfByIds(list);
    }

    @Override
    public int delGoodsXfById(int id) {
        return goodsXfMapper.delGoodsXfById(id);
    }

    @Override
    public int updGoodsXf(GoodsXf goodsXf) {
        return goodsXfMapper.updGoodsXf(goodsXf);
    }

}
