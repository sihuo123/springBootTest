package com.springboot.demo.controller;

import com.alibaba.fastjson.JSON;
import com.springboot.demo.service.GoodsInfoJyService;
import com.springboot.demo.util.Layui;
import com.springboot.demo.vo.GoodsInfoJy;
import com.springboot.demo.vo.GoodsTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: JyController
 * @Description:
 * @Copyright: Copyright(c) 2019
 * @Company: 梦网科技发展有限公司
 * @Author: JiangYi
 * @Date: 2019/6/3 10:15
 * @Version: V1.0
 **/
@Controller
@RequestMapping(value = "/jy")
public class JyController {

    @Autowired
    GoodsInfoJyService goodsInfoJyService;

    /**
     * 跳转主页
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String toLogin(Model model){
        return "jy/index";
    }

    @RequestMapping("/getById")
    public String toGoodsList(String id, Model model){
        model.addAttribute("id", id);
        model.addAttribute("goodsInfo", goodsInfoJyService.getGoodsInfoJyById(id));
        model.addAttribute("goodsTypes", GoodsTypeEnum.values());
        return "jy/goods_info_jy_update";
    }

    /**
     * 查询所有货物
     * @return
     */
    @RequestMapping(value = "/selectAll")
    @ResponseBody
    public Layui selectAll(){
        List<GoodsInfoJy> list = goodsInfoJyService.selectAll();
        return Layui.data(list.size(), list);
    }

    /**
     * 跳转至新增页面
     * @param model
     * @return
     */
    @RequestMapping("/toAdd")
    public String toAdd(Model model){
        model.addAttribute("msg","新增页面");
        model.addAttribute("goodsTypes", GoodsTypeEnum.values());
        return "jy/goods_info_jy_add";
    }

    /**
     * 新增方法
     * @param goodsInfoJy
     * @return
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Boolean add(GoodsInfoJy goodsInfoJy){
        goodsInfoJyService.addGoodsInfoJy(goodsInfoJy);
        return true;
    }

    /**
     * 修改方法
     * @param goodsInfoJy
     * @return
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Boolean update(GoodsInfoJy goodsInfoJy){
        return goodsInfoJyService.updateGoodsInfoJy(goodsInfoJy);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Boolean add(String[] ids){
        goodsInfoJyService.deleteByIds(ids);
        return true;
    }

}
