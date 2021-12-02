package com.plz.modules.entity;

import lombok.Data;

/**
 * @ClassName: CancelGoodsRecordDto
 * @Description: 退货商品dto
 * @Author: PANLVZ
 * @Date: 2021/12/2
 */
@Data
public class CancelGoodsRecordDto {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 退货单表id
     */
    private Integer cancelId;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 单价
     */
    private Double price;

    /**
     * 手提袋数量
     */
    private Integer reticule;

    /**
     * 鞋套数量
     */
    private Integer shoeCover;

    /**
     * 外箱数量
     */
    private Integer container;

    /**
     * 商品名
     */
    private String name;

    /**
     * 规格
     */
    private String size;

    /**
     * 商标名称
     */
    private String brand;

    /**
     * 材质
     */
    private String texture;

    /**
     * 备注
     */
    private String remark;
}
