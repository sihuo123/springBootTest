package com.springboot.demo.service.impl;

import com.springboot.demo.mapper.GoodsInfoJyMapper;
import com.springboot.demo.service.GoodsInfoJyService;
import com.springboot.demo.vo.GoodsInfoJy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName: GoodsServiceImpl
 * @Description:
 * @Copyright: Copyright(c) 2019
 * @Company: 梦网科技发展有限公司
 * @Author: JiangYi
 * @Date: 2019/6/3 11:03
 * @Version: V1.0
 **/
@Service
public class GoodsInfoJyServiceImpl implements GoodsInfoJyService {

    @Autowired
    GoodsInfoJyMapper goodsInfoJyMapper;

    @Override
    public List<GoodsInfoJy> selectAll() {
        return goodsInfoJyMapper.selectAll();
    }

    @Override
    public void addGoodsInfoJy(GoodsInfoJy goodsInfoJy) {
        String id = UUID.randomUUID().toString();
        Date crDate = new Date();
        goodsInfoJy.setId(id);
        goodsInfoJy.setCreatetime(crDate);
        goodsInfoJyMapper.insert(goodsInfoJy);
    }

    @Override
    public void deleteById(String id) {
        goodsInfoJyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIds(String[] ids) {
        goodsInfoJyMapper.deleteByIds(ids);
    }

    @Override
    public GoodsInfoJy getGoodsInfoJyById(String id) {
        return goodsInfoJyMapper.selectByPrimaryKey(id);
    }

    @Override
    public Boolean updateGoodsInfoJy(GoodsInfoJy goodsInfoJy) {
        if(StringUtils.isEmpty(goodsInfoJy.getId())){
            return false;
        }
        goodsInfoJyMapper.updateByPrimaryKeySelective(goodsInfoJy);
        return true;
    }


}
