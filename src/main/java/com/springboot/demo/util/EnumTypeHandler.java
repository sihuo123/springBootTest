package com.springboot.demo.util;

import com.springboot.demo.vo.GoodsTypeEnum;
import org.apache.ibatis.type.MappedTypes;

/**
 * @ClassName: EnumTypeHandler
 * @Description:
 * @Copyright: Copyright(c) 2019
 * @Company: 梦网科技发展有限公司
 * @Author: JiangYi
 * @Date: 2019/6/10 15:58
 * @Version: V1.0
 **/

@MappedTypes(value = { GoodsTypeEnum.class})
public class EnumTypeHandler<E extends Enum<E>> extends BaseEnumTypeHandler<E> {
    public EnumTypeHandler(Class<E> type) {
        super(type);
    }
}

