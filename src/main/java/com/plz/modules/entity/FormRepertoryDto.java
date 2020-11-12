package com.plz.modules.entity;

import lombok.Data;

/**
 * @ClassName: FormRepertoryDto
 * @Description: 关联商品库存信息
 * @Author: PANLVZ
 * @Date: 2020/11/11
 */
@Data
public class FormRepertoryDto {

    /**
     * 仓库id
     */
    private Integer warehouseId;

    /**
     * 仓库名称
     */
    private String warehouseName;

    /**
     * 库存量
     */
    private Integer num;
}
