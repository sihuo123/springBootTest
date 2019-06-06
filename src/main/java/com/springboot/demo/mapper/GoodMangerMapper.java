package com.springboot.demo.mapper;

import com.springboot.demo.vo.GoodsEntity;
import com.springboot.demo.vo.GoodsTypeEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ${zhuyuping} on 2019/6/4 0004.
 */
@Mapper
public interface GoodMangerMapper {
    //查找所有货物商品
    public List<GoodsEntity> findAllGoods(@Param("goodsNumber")String goodsNumber,@Param("goodsName")String goodsName,@Param("goodType")String goodType);
    public GoodsEntity findOneGoods(@Param("goodsId") Integer goodsId);
    //删除所选商品
    public int delGoodsList(@Param("goodsId") int[] goodsId);

    //删除单个商品
    public int delGoods(Integer goodsId);
//查询商品类型
    public List<GoodsTypeEntity> selectGoodsType();
    //查询单个商品类型
    public GoodsTypeEntity selectGoodsTypeById(Integer id);

    //插入
    public int insertGoods(GoodsEntity goodsEntity);
    //修改
    public int updateGoods(GoodsEntity goodsEntity);
}
