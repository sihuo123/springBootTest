package com.springboot.demo.mapper;

import com.springboot.demo.vo.GoodsInfoJy;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GoodsInfoJyMapper {
    int deleteByPrimaryKey(String id);

    int insert(GoodsInfoJy record);

    int insertSelective(GoodsInfoJy record);

    GoodsInfoJy selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(GoodsInfoJy record);

    int updateByPrimaryKey(GoodsInfoJy record);

    List<GoodsInfoJy> selectAll();
}