package com.springboot.demo.vo;

import java.util.HashMap;
import java.util.Map;

public enum GoodsTypeEnum {

    CAN_EAT("0", "可以吃的"),
    NOT_EAT("1", "不可以吃的")
    ;

    private String key;
    private String value;
    private static Map<String, GoodsTypeEnum> goodsTypeEnumMap = new HashMap<>();

    static {
        for (GoodsTypeEnum goodsTypeEnum : GoodsTypeEnum.values()) {
            goodsTypeEnumMap.put(goodsTypeEnum.getKey(), goodsTypeEnum);
        }
    }

    /**
     * 私有化构造函数
     *
     * @param key
     * @param value
     */
    private GoodsTypeEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     *
     * @Title: getSexEnumByKey
     * @Description: 依据key获取枚举
     * @param key
     * @return
     */
    public static GoodsTypeEnum getGoodsTypeEnumByKey(String key) {
        return goodsTypeEnumMap.get(key);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
