package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 退货商品记录表
 * Created by PANLVZ on 2021/11/19
 */
@Data
@TableName("t_cancel_goods_record")
public class CancelGoodsRecord {

    /**
     * 主键
     */
    @TableId("t_id")
    private Integer id;

    /**
     * 商品id
     */
    @TableField("t_goods_id")
    private Integer goodsId;

    /**
     * 退货单表id
     */
    @TableField("t_cancel_id")
    private Integer cancelId;

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
     * 手提袋数量
     */
    @TableField("t_reticule")
    private Integer reticule;

    /**
     * 鞋套数量
     */
    @TableField("t_shoe_cover")
    private Integer shoeCover;

    /**
     * 外箱数量
     */
    @TableField("t_container")
    private Integer container;
}
