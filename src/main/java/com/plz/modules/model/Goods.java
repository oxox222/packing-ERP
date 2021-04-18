package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Goods
 * @Description: 商品
 * @Author: PANLVZ
 * @Date: 2020/10/2
 */
@Data
@TableName(value = "t_goods")
public class Goods {

    /**
     * 主键
     */
    @TableId(value = "t_id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品名
     */
    @TableField(value = "t_name")
    private String name;

    /**
     * 规格
     */
    @TableField(value = "t_size")
    private String size;

    /**
     * 商标名称
     */
    @TableField(value = "t_brand")
    private String brand;

    /**
     * 材质
     */
    @TableField(value = "t_texture")
    private String texture;

    /**
     * 备注
     */
    @TableField(value = "t_remark")
    private String remark;

    /**
     * 单价
     */
    @TableField(value = "t_price")
    private Double price;

    /**
     * 关联商品
     */
    @TableField(exist = false)
    private List<GoodsForm> goodsFormList = new ArrayList<>();

    /**
     * 是否需要手提袋
     * 1:需要(默认);0:不需要
     */
    @TableField("t_reticule_state")
    private Byte ifNeedReticule;

    /**
     * 是否需要鞋套
     * 1:需要;0:不需要(默认)
     */
    @TableField("t_shoecover_state")
    private Byte ifNeedShoeCover;

    /**
     * 外箱容量
     */
    @TableField(value = "t_container_size", updateStrategy = FieldStrategy.IGNORED)
    private Integer containerSize;
}