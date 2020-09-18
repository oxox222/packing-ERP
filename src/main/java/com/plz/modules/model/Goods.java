package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("商品")
@TableName(value = "t_goods")
public class Goods {

    @TableId(value = "t_id", type = IdType.AUTO)
    @ApiModelProperty(value = "主键", required = true)
    private Integer id;

    @TableField(value = "t_name")
    @ApiModelProperty(value = "商品名", required = true)
    private String name;

    @TableField(value = "t_price")
    @ApiModelProperty(value = "单价", required = true)
    private Double price;

    @TableField(value = "t_discount")
    @ApiModelProperty(value = "折扣", required = true)
    private Float discount;

    @TableField(value = "t_paid")
    @ApiModelProperty(value = "实付金额", required = true)
    private Double paid;

    @TableField(value = "t_size")
    @ApiModelProperty(value = "规格", required = true)
    private String size;
}