package com.plz.modules.entity;

import lombok.Data;

/**
 * @ClassName: FormGoodDto
 * @Description: 关联商品
 * @Author: PANLVZ
 * @Date: 2020/11/10
 */
@Data
public class FormGoodDto {

    /**
     * 关联商品id
     */
    private Integer formGoodId;

    /**
     * 关联商品名称
     */
    private String formGoodName;
}
