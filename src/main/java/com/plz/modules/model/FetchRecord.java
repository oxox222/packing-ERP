package com.plz.modules.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.plz.modules.util.DateFormatUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@ApiModel("出库单")
public class FetchRecord implements Serializable {

    @ApiModelProperty(value = "主键", required = true)
    private Integer tId;

    @ApiModelProperty(value = "仓库", required = true)
    private Integer tWarehouseid;

    @ApiModelProperty(value = "单号", required = true)
    private String tOdd;

    @ApiModelProperty(value = "折扣", required = true)
    private Float tDiscount;

    @ApiModelProperty(value = "其他费用")
    private Double tOtherCost;

    @ApiModelProperty(value = "其他费用名称")
    private String tOtherCostname;

    @ApiModelProperty(value = "实收金额", required = true)
    private Double tPaid;

    @ApiModelProperty(value = "销售员")
    private String tSalesman;

    @ApiModelProperty(value = "创建时间", required = true)
    @JsonFormat(pattern = DateFormatUtils.NORMAL_DATETIME_FORMAT)
    private Date tCreateDate;

    @ApiModelProperty(value = "发货方式")
    private String tDeliverway;

    @ApiModelProperty(value = "备注")
    private String tRemake;

    @ApiModelProperty(value = "出库类型", required = true)
    private String tType;

    @ApiModelProperty(value = "顾客id", required = true)
    private Integer tCustomid;

    @ApiModelProperty(value = "图片")
    private String tPhoto;

    @ApiModelProperty(value = "订单状态", required = true)
    private Integer tState;

    @ApiModelProperty(value = "出库商品", required = true)
    private List<FetchGoods> goods;

    private static final long serialVersionUID = 1L;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public Integer gettWarehouseid() {
        return tWarehouseid;
    }

    public void settWarehouseid(Integer tWarehouseid) {
        this.tWarehouseid = tWarehouseid;
    }

    public String gettOdd() {
        return tOdd;
    }

    public void settOdd(String tOdd) {
        this.tOdd = tOdd == null ? null : tOdd.trim();
    }

    public Float gettDiscount() {
        return tDiscount;
    }

    public void settDiscount(Float tDiscount) {
        this.tDiscount = tDiscount;
    }

    public Double gettOtherCost() {
        return tOtherCost;
    }

    public void settOtherCost(Double tOtherCost) {
        this.tOtherCost = tOtherCost;
    }

    public String gettOtherCostname() {
        return tOtherCostname;
    }

    public void settOtherCostname(String tOtherCostname) {
        this.tOtherCostname = tOtherCostname == null ? null : tOtherCostname.trim();
    }

    public Double gettPaid() {
        return tPaid;
    }

    public void settPaid(Double tPaid) {
        this.tPaid = tPaid;
    }

    public String gettSalesman() {
        return tSalesman;
    }

    public void settSalesman(String tSalesman) {
        this.tSalesman = tSalesman == null ? null : tSalesman.trim();
    }

    public Date gettCreateDate() {
        return tCreateDate;
    }

    public void settCreateDate(Date tCreateDate) {
        this.tCreateDate = tCreateDate;
    }

    public String gettDeliverway() {
        return tDeliverway;
    }

    public void settDeliverway(String tDeliverway) {
        this.tDeliverway = tDeliverway == null ? null : tDeliverway.trim();
    }

    public String gettRemake() {
        return tRemake;
    }

    public void settRemake(String tRemake) {
        this.tRemake = tRemake == null ? null : tRemake.trim();
    }

    public String gettType() {
        return tType;
    }

    public void settType(String tType) {
        this.tType = tType == null ? null : tType.trim();
    }

    public Integer gettCustomid() {
        return tCustomid;
    }

    public void settCustomid(Integer tCustomid) {
        this.tCustomid = tCustomid;
    }

    public String gettPhoto() {
        return tPhoto;
    }

    public void settPhoto(String tPhoto) {
        this.tPhoto = tPhoto == null ? null : tPhoto.trim();
    }

    public Integer gettState() {
        return tState;
    }

    public void settState(Integer tState) {
        this.tState = tState;
    }

    public List<FetchGoods> getGoods() {
        return goods;
    }

    public void setGoods(List<FetchGoods> goods) {
        this.goods = goods;
    }
}