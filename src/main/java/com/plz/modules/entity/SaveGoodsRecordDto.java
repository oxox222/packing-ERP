package com.plz.modules.entity;

import lombok.Data;

/**
 * @ClassName: SaveGoodsRecordDto
 * @Description: 入库商品记录查询返回类
 * @Author: PANLVZ
 * @Date: 2020/10/6
 */
@Data
public class SaveGoodsRecordDto {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 单价
     */
    private Double price;

    /**
     * 折扣
     */
    private Float discount;

    /**
     * 实付金额
     */
    private Double paid;

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
