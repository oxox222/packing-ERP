package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: FetchGoodsRecord
 * @Description: 出库商品记录
 * @Author: PANLVZ
 * @Date: 2020/10/2
 */
@Data
@TableName("t_fetch_goods_record")
public class FetchGoodsRecord implements Serializable {

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
     * 出库单表id
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