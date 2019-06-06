package com.springboot.demo.service;

import com.springboot.demo.vo.GoodsEntity;
import com.springboot.demo.vo.GoodsTypeEntity;
import org.apache.ibatis.annotations.Param;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ${zhuyuping} on 2019/6/4 0004.
 */
public interface GoodsMangerService {

    /**
     * 查找所有数据
     * @param goodsNumber
     * @param goodsName
     * @param goodType
     * @return
     */
    public List<GoodsEntity> getGoodsList(String goodsNumber, String goodsName, String goodType);

    /**
     * 删除所选商品
     * @param goodIds
     * @return
     */
    public int delGoodsList(int[] goodIds);
    /**
     * 删除单个商品
     * @param goodId
     * @return
     */
    public int delGoods(Integer goodId);

    /**
     * 修改所选商品
     * @param goodsId
     * @return
     */
    public int updateGoods(Integer goodsId);

    public List<GoodsTypeEntity> getListGoodsType();
    public int insertGoods(GoodsEntity goodsEntity);
    public GoodsTypeEntity getTyepById(Integer id);
    public int updateGoods(GoodsEntity goodsEntity);

    public GoodsEntity getOneGoods(Integer id);
}
