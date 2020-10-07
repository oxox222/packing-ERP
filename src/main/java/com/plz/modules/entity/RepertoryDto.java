package com.plz.modules.entity;

import lombok.Data;

/**
 * @ClassName: RepertoryDto
 * @Description: 库存信息
 * @Author: PANLVZ
 * @Date: 2020/10/2
 */
@Data
public class RepertoryDto {

    /**
     * 仓库id
     */
    private Integer warehouseId;

    /**
     * 仓库名称
     */
    private String warehouseName;

    /**
     * 商品id
     */
    private Integer goodId;

    /**
     * 商品名
     */
    private String goodName;

    /**
     * 商品规格
     */
    private String goodSize;

    /**
     * 商标名称
     */
    private String goodBrand;

    /**
     * 商品材质
     */
    private String goodTexture;

    /**
     * 商品备注
     */
    private String goodRemark;

    /**
     * 库存数量
     */
    private Integer num;
}
