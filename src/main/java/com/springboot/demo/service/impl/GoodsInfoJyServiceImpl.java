package com.springboot.demo.service.impl;

import com.springboot.demo.mapper.GoodsInfoJyMapper;
import com.springboot.demo.service.GoodsInfoJyService;
import com.springboot.demo.vo.GoodsInfoJy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        goodsInfoJyMapper.insert(goodsInfoJy);
    }
}
