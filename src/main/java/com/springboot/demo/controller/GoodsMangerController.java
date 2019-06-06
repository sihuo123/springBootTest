package com.springboot.demo.controller;

import com.springboot.demo.service.GoodsMangerService;
import com.springboot.demo.vo.GoodsEntity;
import com.springboot.demo.vo.GoodsTypeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ${zhuyuping} on 2019/6/4 0004.
 */
@Controller
public class GoodsMangerController {
    @Autowired
private GoodsMangerService goodsMangerService;
    /**
     * 返回后台商品管理页面
     * @return
     */
    @RequestMapping("/admin/goodsManger")
    public String toGoodsManger( Model model,String goodNumber,String  goodsName,String goodType){

        //获取所有的货物商品
       List<GoodsEntity> goodsList =  goodsMangerService.getGoodsList(goodNumber,goodsName,goodType);
       //获取所有商品类型
       List<GoodsTypeEntity> typeList= goodsMangerService.getListGoodsType();
       model.addAttribute("typeList",typeList);
       model.addAttribute("goodsList",goodsList);
       return "admin/goodsManger";
    }

    /**
     * 删除商品
     * @return
     */
    @RequestMapping("/admin/delManger")
    @ResponseBody
    public int del(Integer goodId){
        return goodsMangerService.delGoods(goodId);
    }


    /**
     * 删除所选择商品
     * @return
     */
    @RequestMapping("/admin/delAllManger")
    @ResponseBody
    public int delList(int[] goodIds){
        return goodsMangerService.delGoodsList(goodIds);
    }
    @RequestMapping("/admin/toAddGoodsManger")
    public String toAddOrUpdate(Model model){
        //获取所有商品类型
        List<GoodsTypeEntity> typeList= goodsMangerService.getListGoodsType();
        model.addAttribute("typeList",typeList);
        //System.out.println(goodsEntity);

        return "admin/add";

    }
      @RequestMapping("/admin/addGoodsManger")
    public String toAddOrUpdate(Model model,String goodsNumber,Double goodsInPrice,Integer goodsNum ,String goodsType,String goodsIntroduction,String goodsName ){
          System.out.println(goodsNumber+"goodsInPrice:"+goodsInPrice+"goodsNum:"+goodsNum+"goodsType:"+goodsType+"goodsIntroduction:"+goodsIntroduction+"goodsName:"+goodsName);
                GoodsEntity g= new GoodsEntity();
                g.setGoodsInPrice(goodsInPrice);
                g.setGoodsIntroduction(goodsIntroduction);
                g.setGoodsName(goodsName);
                g.setGoodsNum(goodsNum);
                g.setGoodsNumber(goodsNumber);
                GoodsTypeEntity gType = goodsMangerService.getTyepById(Integer.valueOf(goodsType));
                g.setGoodsTypeEntity(gType);
                goodsMangerService.insertGoods(g);
          //获取所有商品类型
          List<GoodsTypeEntity> typeList= goodsMangerService.getListGoodsType();
          model.addAttribute("typeList",typeList);
          //System.out.println(goodsEntity);

        return "redirect:/admin/goodsManger";

    }

    @RequestMapping("/admin/toEditGoodsManger")
    public String toEditUpdate(Model model,String goodNumber,String  goodsName,String goodType){
        //获取商品类型
        GoodsEntity goods= goodsMangerService.getGoodsList(goodNumber,goodsName,goodType).get(0);
        //获取所有商品类型
        List<GoodsTypeEntity> typeList= goodsMangerService.getListGoodsType();
        model.addAttribute("typeList",typeList);
        model.addAttribute("goods",goods);
        return "admin/edit";

    }

    @RequestMapping("/admin/doEditGoodsManger")
    @ResponseBody
    public int doEdit(Model model,String goodsNumber,Double goodsInPrice,Integer goodsNum ,String goodsType,String goodsIntroduction,String goodsName,Integer goodsId){
        GoodsEntity g= goodsMangerService.getOneGoods(goodsId);
        g.setGoodsInPrice(goodsInPrice);
        g.setGoodsIntroduction(goodsIntroduction);
        g.setGoodsName(goodsName);
        g.setGoodsNum(goodsNum);
        g.setGoodsNumber(goodsNumber);
        GoodsTypeEntity gType = goodsMangerService.getTyepById(Integer.valueOf(goodsType));
        g.setGoodsTypeEntity(gType);

        return  goodsMangerService.updateGoods(g);

    }
}
