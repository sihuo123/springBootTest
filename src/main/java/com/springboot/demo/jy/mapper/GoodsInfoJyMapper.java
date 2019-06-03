package com.springboot.demo.jy.mapper;

import com.springboot.demo.jy.vo.GoodsInfoJy;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GoodsInfoJyMapper {
    int insert(GoodsInfoJy record);

    int insertSelective(GoodsInfoJy record);

    List<GoodsInfoJy> selectAll();
}