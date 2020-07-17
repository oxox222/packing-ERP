package com.plz.modules.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.plz.modules.util.DateFormatUtils;
import lombok.Data;

/**
 * @ClassName: SaveRecordListDto
 * @Description: 入库单列表dto
 * @Author: PANLVZ
 * @Date: 2020/7/17
 */
@Data
public class SaveRecordListDto {

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
     * 金额
     */
    private Double paid;

    /**
     * 供应商
     */
    private String supplier;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = DateFormatUtils.NORMAL_DATETIME_FORMAT)
    private String createTime;
}
