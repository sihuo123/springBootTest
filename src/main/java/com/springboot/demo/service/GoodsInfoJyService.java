package com.springboot.demo.service;

import com.springboot.demo.vo.GoodsInfoJy;

import java.util.List;

/**
 * @ClassName: GoodsInfoJyService
 * @Description:
 * @Copyright: Copyright(c) 2019
 * @Company: 梦网科技发展有限公司
 * @Author: JiangYi
 * @Date: 2019/6/3 11:03
 * @Version: V1.0
 **/
public interface GoodsInfoJyService {

    public List<GoodsInfoJy> selectAll();

    public void addGoodsInfoJy(GoodsInfoJy goodsInfoJy);

    public void deleteById(String id);

    public void deleteByIds(String[] ids);

    public GoodsInfoJy getGoodsInfoJyById(String id);

    public Boolean updateGoodsInfoJy(GoodsInfoJy goodsInfoJy);

}
