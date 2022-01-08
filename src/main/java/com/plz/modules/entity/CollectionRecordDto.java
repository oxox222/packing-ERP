package com.plz.modules.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName: CollectionRecordDto
 * @Description: 收款单
 * @Author: PANLVZ
 * @Date: 2022/1/2
 */
@Data
public class CollectionRecordDto {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 顾客id
     */
    private Integer customId;

    /**
     * 客户名称
     */
    private String customName;

    /**
     * 收款金额
     */
    private Double collection;

    /**
     * 收款时间
     */
    private Date collectionTime;

    /**
     * 货款年月
     */
    private Date goodsTime;
}
