package com.plz.modules.vo;

import lombok.Data;

/**
 * @ClassName: RepertoryQueryVo
 * @Description: 库存查询条件
 * @Author: PANLVZ
 * @Date: 2020/10/2
 */
@Data
public class RepertoryQueryVo {

    /**
     * 仓库主键
     */
    private Integer warehouseId;

    /**
     * 商品主键
     */
    private Integer goodId;

}
