package com.plz.modules.entity;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: GoodFormDto
 * @Description: 关联商品列表查询
 * @Author: PANLVZ
 * @Date: 2020/11/10
 */
@Data
public class GoodFormDto {

    /**
     * 源商品id
     */
    private Integer originGoodId;

    /**
     * 源商品名称
     */
    private String originGoodName;

    /**
     * 库存信息集合
     */
    private List<FormRepertoryDto> formRepertoryDtoList;

    /**
     * 关联商品集合
     */
    private List<FormGoodDto> formGoodDtoList;
}
