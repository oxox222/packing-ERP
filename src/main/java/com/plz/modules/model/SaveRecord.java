package com.plz.modules.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.plz.modules.util.DateFormatUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@ApiModel("入库单")
public class SaveRecord implements Serializable {

    @ApiModelProperty(value = "主键", required = true)
    private Integer tId;

    @ApiModelProperty(value = "单号", required = true)
    private String tOdd;

    @ApiModelProperty(value = "仓库", required = true)
    private Integer tWarehouseid;

    @ApiModelProperty(value = "折扣", required = true)
    private Float tDiscount;

    @ApiModelProperty(value = "实付金额", required = true)
    private Double tPaid;

    @ApiModelProperty(value = "创建时间", required = true)
    @JsonFormat(pattern = DateFormatUtils.NORMAL_DATETIME_FORMAT)
    private Date tCreateDate;

    @ApiModelProperty(value = "备注")
    private String tRemark;

    @ApiModelProperty(value = "供应商id", required = true)
    private Integer tSupplierid;

    @ApiModelProperty(value = "入库类型", required = true)
    private String tType;

    @ApiModelProperty(value = "图片")
    private String tPhoto;

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "入库商品", required = true)
    private List<SaveGoods> goods;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettOdd() {
        return tOdd;
    }

    public void settOdd(String tOdd) {
        this.tOdd = tOdd == null ? null : tOdd.trim();
    }

    public Integer gettWarehouseid() {
        return tWarehouseid;
    }

    public void settWarehouseid(Integer tWarehouseid) {
        this.tWarehouseid = tWarehouseid;
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

    public Date gettCreateDate() {
        return tCreateDate;
    }

    public void settCreateDate(Date tCreateDate) {
        this.tCreateDate = tCreateDate;
    }

    public String gettRemark() {
        return tRemark;
    }

    public void settRemark(String tRemark) {
        this.tRemark = tRemark == null ? null : tRemark.trim();
    }

    public Integer gettSupplierid() {
        return tSupplierid;
    }

    public void settSupplierid(Integer tSupplierid) {
        this.tSupplierid = tSupplierid;
    }

    public String gettType() {
        return tType;
    }

    public void settType(String tType) {
        this.tType = tType == null ? null : tType.trim();
    }

    public String gettPhoto() {
        return tPhoto;
    }

    public void settPhoto(String tPhoto) {
        this.tPhoto = tPhoto == null ? null : tPhoto.trim();
    }

    public List<SaveGoods> getGoods() {
        return goods;
    }

    public void setGoods(List<SaveGoods> goods) {
        this.goods = goods;
    }
}