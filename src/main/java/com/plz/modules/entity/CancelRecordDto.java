package com.plz.modules.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: CancelRecordDto
 * @Description: 退货单dto
 * @Author: PANLVZ
 * @Date: 2021/12/2
 */
@Data
public class CancelRecordDto {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 顾客id
     */
    private Integer customId;

    /**
     * 顾客名称
     */
    private String customName;

    /**
     * 退货方id
     */
    private Integer cancelPersonId;

    /**
     * 退货方名称
     */
    private String cancelPersonName;

    /**
     * 退货时间
     */
    private Date cancelTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 退货商品集合
     */
    List<CancelGoodsRecordDto> cancelGoodsRecordList = new ArrayList<>();
}
