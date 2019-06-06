package com.springboot.demo.controller;

import com.springboot.demo.service.GoodsInfoJyService;
import com.springboot.demo.vo.GoodsInfoJy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @RequestMapping("/login")
    public String toLogin(Model model){
        model.addAttribute("msg","你好");
        return "jy/hello";
    }

    @RequestMapping("/toGoodsList")
    public String toGoodsList(Model model){
        List<GoodsInfoJy> list = goodsInfoJyService.selectAll();
        model.addAttribute("goods",list);
        return "jy/goods_info_jy_list";
    }

    @ResponseBody
    @RequestMapping(value = "/selectAll")
    public String selectAll(){
        List<GoodsInfoJy> list = goodsInfoJyService.selectAll();
        String s = list.get(0).toString();
        return s;
    }

    @RequestMapping("/toAdd")
    public String toAdd(Model model){
        model.addAttribute("msg","新增页面");
        System.out.println("toAdd");
        return "jy/goods_info_jy_add";
    }

    @PostMapping(value = "/add")
    public String add(GoodsInfoJy goodsInfoJy){
        goodsInfoJyService.addGoodsInfoJy(goodsInfoJy);
        return "jy/goods_info_jy_add";
    }

    @RequestMapping(value = "/delete")
    @ResponseBody
    public Boolean add(String id){
        System.out.println("============deleteId[" + id + "]============");
        goodsInfoJyService.deleteById(id);
        return true;
    }

}
