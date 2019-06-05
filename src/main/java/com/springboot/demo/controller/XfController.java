package com.springboot.demo.controller;

import com.springboot.demo.service.GoodsXfService;
import com.springboot.demo.vo.GoodsXf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 控制类.
 */
@Controller
@RequestMapping("/xf")
public class XfController {

    @Autowired
    private GoodsXfService goodsXfService;

    private static final String html = "xf/goods_xf";

    @RequestMapping("/test")
    @ResponseBody
    public List<GoodsXf> test(){
        List<GoodsXf> list =  goodsXfService.getGoodsXfs();
        return list;
    }

    @RequestMapping("/load")
    public String load(Model model){
        List<GoodsXf> goodsXfs = goodsXfService.getGoodsXfs();
        model.addAttribute("goodsXfs",goodsXfs);
        return html;
    }

    @RequestMapping("/add")
    public String add(GoodsXf goodsXf){
        goodsXfService.addGoodsXf(goodsXf);
        return "redirect:/xf/load";
    }

    @RequestMapping("/query")
    public String query(String serNumber,String tradeName,String classify,Model model){
        GoodsXf goodsXf = new GoodsXf();
        if(serNumber!=null&&!"".equals(serNumber.trim())){
            goodsXf.setSerNumber(Integer.valueOf(serNumber));
        }
        if(tradeName!=null&&!"".equals(tradeName.trim())){
            goodsXf.setTradeName(tradeName.trim());
        }
        if(classify!=null&&!"".equals(classify.trim())){
            goodsXf.setClassify(classify.trim());
        }
        List<GoodsXf> goodsXfs = goodsXfService.getGoodsXfs(goodsXf);
        model.addAttribute("goodsXfs",goodsXfs);
        return html;
    }

    @RequestMapping("/delById")
    @ResponseBody
    public void delById(int id){
        goodsXfService.delGoodsXfById(id);
    }

    @RequestMapping("/delByIds")
    @ResponseBody
    public void delByIds(int[] list){
        goodsXfService.delGoodsXfByIds(list);
    }

    @RequestMapping("/toUpdate")
    @ResponseBody
    public GoodsXf toUpdate(int id){
        GoodsXf g = new GoodsXf();
        g.setId(id);
        g = goodsXfService.getGoodsXfs(g).get(0);
        return g;
    }

    @RequestMapping("/update")
    public String update(GoodsXf g,Model model){
        goodsXfService.updGoodsXf(g);
        return "redirect:/xf/load";
    }
}
