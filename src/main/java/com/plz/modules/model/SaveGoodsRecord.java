package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: SaveGoodsRecord
 * @Description: 入库商品记录
 * @Author: PANLVZ
 * @Date: 2020/8/19
 */
@Data
@TableName("t_save_goods_record")
public class SaveGoodsRecord implements Serializable {

    private static final long serialVersionUID = 2411711269861108946L;

    /**
     * 主键
     */
    @TableId("t_id")
    private Integer id;

    /**
     * 商品id
     */
    @TableField("t_goodsId")
    private Integer goodsId;

    /**
     * 入库单表id
     */
    @TableField("t_recordId")
    private Integer recordId;

    /**
     * 数量
     */
    @TableField("t_num")
    private Integer num;

    /**
     * 单价
     */
    @TableField("t_price")
    private Double price;

    /**
     * 折扣
     */
    @TableField("t_discount")
    private Float discount;

    /**
     * 实付金额
     */
    @TableField("t_paid")
    private Double paid;

}
