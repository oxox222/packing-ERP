package com.plz.modules.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "出库商品")
public class FetchGoods implements Serializable {

    @ApiModelProperty(value = "主键", required = true)
    private Integer tId;

    @ApiModelProperty(value = "入库表id", required = true)
    private Integer tRecordid;

    @ApiModelProperty(value = "商品名", required = true)
    private String tName;

    @ApiModelProperty(value = "单价", required = true)
    private Double tPrice;

    @ApiModelProperty(value = "折扣", required = true)
    private Float tDiscount;

    @ApiModelProperty(value = "实付金额", required = true)
    private Double tPaid;

    @ApiModelProperty(value = "数量", required = true)
    private Integer tNum;

    @ApiModelProperty(value = "规格", required = true)
    private String tSize;

    @ApiModelProperty(value = "出库类型", required = true)
    private String tType;

    private static final long serialVersionUID = 1L;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public Integer gettRecordid() {
        return tRecordid;
    }

    public void settRecordid(Integer tRecordid) {
        this.tRecordid = tRecordid;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public Double gettPrice() {
        return tPrice;
    }

    public void settPrice(Double tPrice) {
        this.tPrice = tPrice;
    }

    public Float gettDiscount() {
        return tDiscount;
    }

    public void settDiscount(Float tDiscount) {
        this.tDiscount = tDiscount;
    }

    public Double gettPaid() {
        return tPaid;
    }

    public void settPaid(Double tPaid) {
        this.tPaid = tPaid;
    }

    public Integer gettNum() {
        return tNum;
    }

    public void settNum(Integer tNum) {
        this.tNum = tNum;
    }

    public String gettSize() {
        return tSize;
    }

    public void settSize(String tSize) {
        this.tSize = tSize == null ? null : tSize.trim();
    }

    public String gettType() {
        return tType;
    }

    public void settType(String tType) {
        this.tType = tType == null ? null : tType.trim();
    }
}