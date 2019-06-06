package com.springboot.demo.mapper;

import com.springboot.demo.vo.Goods_tlq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by tanlq on 2019/6/5.
 */
@Mapper
public interface GoodsMapper_tlq {

    List<Goods_tlq> findAllGoods();

    Goods_tlq findById(int id);

    int insertGoods(Goods_tlq good);

    int updateById(Goods_tlq goods);

    int deleteById(int id);

    int deleteByIds(int[] ids);

}
