package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName: DeclarationGoods
 * @Description: 报单商品记录表
 * @Author: PANLVZ
 * @Date: 2021/5/4
 */
@Data
@TableName("t_declaration_goods")
public class DeclarationGoods {

    /**
     * 主键
     */
    @TableId("t_id")
    private Integer id;

    /**
     * 商品表id
     */
    @TableField("t_goodsId")
    private Integer goodsId;

    /**
     * 报单表id
     */
    @TableField("t_declarationId")
    private Integer declarationId;

    /**
     * 数量
     */
    @TableField("t_num")
    private Integer num;

    /**
     * 手提袋数量
     */
    @TableField("t_reticule")
    private Integer reticule;

    /**
     * 鞋套数量
     */
    @TableField("t_shoecover")
    private Integer shoeCover;

    /**
     * 外箱数量
     */
    @TableField("t_container")
    private Integer container;

    /**
     * 备注
     */
    @TableField("t_remark")
    private String remark;
}
