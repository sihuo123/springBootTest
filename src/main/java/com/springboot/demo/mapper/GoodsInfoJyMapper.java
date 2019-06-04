package com.springboot.demo.mapper;

import com.springboot.demo.vo.GoodsInfoJy;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GoodsInfoJyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsInfoJy record);

    int insertSelective(GoodsInfoJy record);

    GoodsInfoJy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsInfoJy record);

    int updateByPrimaryKey(GoodsInfoJy record);

    List<GoodsInfoJy> selectAll();
}