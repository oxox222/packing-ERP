package com.plz.modules.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.plz.modules.util.DateFormatUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName: SaveRecordListDto
 * @Description: 入库单列表dto
 * @Author: PANLVZ
 * @Date: 2020/7/17
 */
@Data
@ApiModel(value = "入库单列表")
public class SaveRecordListDto {

    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Integer id;

    /**
     * 仓库
     */
    @ApiModelProperty(value = "仓库")
    private String warehouse;

    /**
     * 订单号
     */
    @ApiModelProperty(value = "订单号")
    private String odd;

    /**
     * 金额
     */
    @ApiModelProperty(value = "金额")
    private Double paid;

    /**
     * 供应商
     */
    @ApiModelProperty(value = "供应商")
    private String supplier;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = DateFormatUtils.NORMAL_DATETIME_FORMAT)
    private String createTime;
}
