package com.springboot.demo.controller;

import com.springboot.demo.service.GoodsService_tlq;
import com.springboot.demo.vo.Goods_tlq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by tanlq on 2019/6/4.
 */
@Controller
public class GoodsController_tlq {
    @Autowired
    private GoodsService_tlq goodsService;

    /**
     * 商品列表
     * @param model
     * @return
     */
    @RequestMapping("/goods_list")
    public String goods(Model model){
        List<Goods_tlq> goodsList = goodsService.findAllGoods();
        model.addAttribute("goodsList",goodsList);
        return "/goods_list_tlq";
    }

    /**
     * 跳转到新增页面
     * @return
     */
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "goods_add_tlq";
    }

    /**
     * 新增
     * @param request
     * @return
     */
    @RequestMapping("/add")
    public String add(HttpServletRequest request){
        String goodsNum = request.getParameter("goodsNum");
        String goodsName = request.getParameter("goodsName");
        String goodsPrice = request.getParameter("goodsPrice");
        String goodsInventory =request.getParameter("goodsInventory");

        Goods_tlq goods = new Goods_tlq();
        goods.setGoodsNum(goodsNum);
        goods.setGoodsName(goodsName);
        goods.setGoodsPrice(Double.parseDouble(goodsPrice));
        goods.setGoodsInventory(Integer.parseInt(goodsInventory));

        int rows = goodsService.insertGoods(goods);

        return "redirect:/goods_list";
    }

    /**
     * 修改
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/edit")
    public String edit(Model model, HttpServletRequest request){
        String goodsId = request.getParameter("goodsId");
        String goodsNum = request.getParameter("goodsNum");
        String goodsName = request.getParameter("goodsName");
        String goodsPrice = request.getParameter("goodsPrice");
        String goodsInventory =request.getParameter("goodsInventory");

        Goods_tlq goods = new Goods_tlq();
        goods.setGoodsId(Integer.parseInt(goodsId));
        goods.setGoodsNum(goodsNum);
        goods.setGoodsName(goodsName);
        goods.setGoodsPrice(Double.parseDouble(goodsPrice));
        goods.setGoodsInventory(Integer.parseInt(goodsInventory));

        int rows = goodsService.updateById(goods);

        return "redirect:/goods_list";
    }

    /**
     * 跳转到修改页面
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/toEdit")
    public String edit(Model model,int id){

        Goods_tlq goods = goodsService.findById(id);
        model.addAttribute("goods",goods);

        return "/goods_edit_tlq";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/del")
    public boolean del(int id){

        boolean result = false;
        int rows = goodsService.deleteById(id);
        if(rows > 0){
            result = true;
        }

        return result;
    }

    /**
     * 批量删除
     * @param arr
     * @return
     */
    @ResponseBody
    @RequestMapping("/delByIds")
    public boolean delByIds(int[] arr){

        boolean result = false;
        int rows = goodsService.deleteByIds(arr);
        if(rows > 0){
            result = true;
        }

        return result;
    }

    @RequestMapping("/test")
    public String test(){
        return "/test";
    }
}