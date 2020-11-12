package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName: GoodsForm
 * @Description: 商品关联
 * @Author: PANLVZ
 * @Date: 2020/11/9
 */
@Data
@TableName("t_goods_form")
public class GoodsForm {

    /**
     * 源商品
     */
    @TableField("t_origin_goodId")
    private Integer originGoodId;

    /**
     * 关联商品
     */
    @TableField("t_form_goodId")
    private Integer formGoodId;
}
