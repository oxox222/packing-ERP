package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName: repertory
 * @Description: 库存
 * @Author: PANLVZ
 * @Date: 2020/10/7
 */
@Data
@TableName("v_repertory")
public class Repertory {

    /**
     * 仓库id
     */
    @TableField("t_warehouseId")
    private Integer warehouseId;

    /**
     * 商品id
     */
    @TableField("t_goodsId")
    private Integer goodsId;

    /**
     * 库存量
     */
    @TableField("t_num")
    private Integer num;
}
