package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName: StatisticsDto
 * @Description: 仓库商品统计类
 * @Author: PANLVZ
 * @Date: 2020/10/22
 */
@Data
@TableName("v_statistics")
public class Statistics {

    /**
     * 仓库id
     */
    @TableField("t_warehouseId")
    private Integer warehouseId;

    /**
     * 仓库名
     */
    @TableField("t_warehouseName")
    private String warehouseName;

    /**
     * 总数量
     */
    @TableField("t_num")
    private Integer num;

    /**
     * 商品种类数量
     */
    @TableField("t_types")
    private Integer types;
}
