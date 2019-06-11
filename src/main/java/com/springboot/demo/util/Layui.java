package com.springboot.demo.util;

import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: Layui
 * @Description:
 * @Copyright: Copyright(c) 2019
 * @Company: 梦网科技发展有限公司
 * @Author: JiangYi
 * @Date: 2019/6/5 15:56
 * @Version: V1.0
 **/
public class Layui extends HashMap<String, Object> {

    public static Layui data(Integer count, List<?> data){
        Layui r = new Layui();
        r.put("code", 0);
        r.put("msg", "");
        r.put("count", count);
        r.put("data", data);
        return r;
    }
}

