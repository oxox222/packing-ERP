package com.plz.modules.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.plz.modules.util.DateFormatUtils;
import lombok.Data;

/**
 * @ClassName: SaveRecordListDto
 * @Description: 出库单列表dto
 * @Author: PANLVZ
 * @Date: 2020/7/17
 */
@Data
public class FetchRecordListDto {

    /**
     * id
     */
    private Integer id;

    /**
     * 仓库
     */
    private String warehouse;

    /**
     * 订单号
     */
    private String odd;

    /**
     * 销售员
     */
    private String salesman;

    /**
     * 状态
     */
    private int state;

    /**
     * 金额
     */
    private Double paid;

    /**
     * 顾客
     */
    private String custom;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = DateFormatUtils.NORMAL_DATETIME_FORMAT)
    private String createTime;
}
