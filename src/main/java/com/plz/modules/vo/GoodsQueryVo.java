package com.plz.modules.vo;

import lombok.Data;

/**
 * @ClassName: GoodsQueryVo
 * @Description: 商品查询条件
 * @Author: PANLVZ
 * @Date: 2020/10/2
 */
@Data
public class GoodsQueryVo {

    /**
     * 商品名
     */
    private String name;

    /**
     * 商品类型
     */
    private Byte type;
}
