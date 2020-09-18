package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: SaveGoodsRecord
 * @Description: 入库商品记录
 * @Author: PANLVZ
 * @Date: 2020/8/19
 */
@ApiModel("入库商品记录")
@Data
public class SaveGoodsRecord implements Serializable {

    private static final long serialVersionUID = 2411711269861108946L;

    @TableId(value = "t_id", type = IdType.AUTO)
    @ApiModelProperty(value = "主键", required = true)
    private Integer id;

    @TableField(value = "t_goods")
    @ApiModelProperty(value = "商品号", required = true)
    private Integer goods;

    @TableField(value = "num")
    @ApiModelProperty(value = "数量", required = true)
    private Integer num;

    @TableField(value = "type")
    @ApiModelProperty(value = "商品类型", required = true)
    private Byte type;
}
