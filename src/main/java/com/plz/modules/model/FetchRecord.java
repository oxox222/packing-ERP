package com.plz.modules.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class FetchRecord implements Serializable {
    private Integer tId;

    private Integer tWarehouseid;

    private String tOdd;

    private Float tDiscount;

    private Double tOtherCost;

    private String tOtherCostname;

    private Double tPaid;

    private String tSalesman;

    private Date tCreateDate;

    private String tDeliverway;

    private String tRemake;

    private String tType;

    private Integer tCustomid;

    private String tPhoto;

    private Integer tState;

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