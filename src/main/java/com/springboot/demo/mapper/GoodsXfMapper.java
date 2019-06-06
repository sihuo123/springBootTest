package com.springboot.demo.mapper;

import com.springboot.demo.vo.GoodsXf;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 数据访问层接口.
 */
@Mapper
@Repository
public interface GoodsXfMapper {

    /**
     * 查询全部
     */
    @Select("select * from goods_xf")
    List<GoodsXf> getAll();

    /**
     * 按条件查询
     */
    List<GoodsXf> getGoodsXfs(GoodsXf goodsXf);
    /**
     * 添加
     */
    @Insert("insert into goods_xf VALUES(DEFAULT,#{serNumber},#{tradeName},#{classify},#{describe},#{price},now(),now())")
    int addGoodsXf(GoodsXf goodsXf);
    /**
     * 删除
     */
    int delGoodsXfByIds(int[] ids);
    /**
     * 删除
     */
    @Delete("delete from goods_xf where id = #{id}")
    int delGoodsXfById(int id);
    /**
     * 更新
     */
    @Update("update goods_xf set tradeName=#{tradeName},classify=#{classify},`describe`=#{describe},price=#{price},updateTime=now() where id=#{id}")
    int updGoodsXf(GoodsXf goodsXf);
}
