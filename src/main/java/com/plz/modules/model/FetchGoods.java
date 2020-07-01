package com.plz.modules.model;

import java.io.Serializable;

public class FetchGoods implements Serializable {
    private Integer tId;

    private Integer tRecordid;

    private String tName;

    private Double tPrice;

    private Float tDiscount;

    private Double tPaid;

    private Integer tNum;

    private String tSize;

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