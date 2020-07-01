package com.plz.modules.model;

import java.io.Serializable;
import java.util.Date;

public class SaveRecord implements Serializable {
    private Integer tId;

    private String tOdd;

    private Integer tWarehouseid;

    private Float tDiscount;

    private Double tPaid;

    private Date tCreateDate;

    private String tRemark;

    private Integer tSupplierid;

    private String tType;

    private String tPhoto;

    private static final long serialVersionUID = 1L;

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
}