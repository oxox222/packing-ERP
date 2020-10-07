package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

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
}