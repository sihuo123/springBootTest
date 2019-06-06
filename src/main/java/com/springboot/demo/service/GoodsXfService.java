package com.springboot.demo.service;

import com.springboot.demo.vo.GoodsXf;

import java.util.List;

/**
 * service接口.
 */
public interface GoodsXfService {

    /**
     * 获取所有
     */
    List<GoodsXf> getGoodsXfs();
    /**
     * 按条件获取
     */
    List<GoodsXf> getGoodsXfs(GoodsXf goodsXf);
    /**
     * 添加
     */
    int addGoodsXf(GoodsXf goodsXf);
    /**
     * 删除
     */
    int delGoodsXfByIds(int[] list);
    /**
     * 删除
     */
    int delGoodsXfById(int id);
    /**
     * 更新
     */
    int updGoodsXf(GoodsXf goodsXf);
}
