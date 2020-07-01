package com.plz.modules.model;

import java.io.Serializable;

public class Supplier implements Serializable {
    private Integer tId;

    private String tName;

    private String tLeader;

    private Float tDiscount;

    private String tMobilphone;

    private String tPhone;

    private String tMail;

    private String tFax;

    private String tWebsite;

    private String tAddr;

    private String tAddrdetail;

    private String tBank;

    private String tBankAccount;

    private String tBankAccountname;

    private Integer tSort;

    private String tRemark;

    private static final long serialVersionUID = 1L;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettLeader() {
        return tLeader;
    }

    public void settLeader(String tLeader) {
        this.tLeader = tLeader == null ? null : tLeader.trim();
    }

    public Float gettDiscount() {
        return tDiscount;
    }

    public void settDiscount(Float tDiscount) {
        this.tDiscount = tDiscount;
    }

    public String gettMobilphone() {
        return tMobilphone;
    }

    public void settMobilphone(String tMobilphone) {
        this.tMobilphone = tMobilphone == null ? null : tMobilphone.trim();
    }

    public String gettPhone() {
        return tPhone;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone == null ? null : tPhone.trim();
    }

    public String gettMail() {
        return tMail;
    }

    public void settMail(String tMail) {
        this.tMail = tMail == null ? null : tMail.trim();
    }

    public String gettFax() {
        return tFax;
    }

    public void settFax(String tFax) {
        this.tFax = tFax == null ? null : tFax.trim();
    }

    public String gettWebsite() {
        return tWebsite;
    }

    public void settWebsite(String tWebsite) {
        this.tWebsite = tWebsite == null ? null : tWebsite.trim();
    }

    public String gettAddr() {
        return tAddr;
    }

    public void settAddr(String tAddr) {
        this.tAddr = tAddr == null ? null : tAddr.trim();
    }

    public String gettAddrdetail() {
        return tAddrdetail;
    }

    public void settAddrdetail(String tAddrdetail) {
        this.tAddrdetail = tAddrdetail == null ? null : tAddrdetail.trim();
    }

    public String gettBank() {
        return tBank;
    }

    public void settBank(String tBank) {
        this.tBank = tBank == null ? null : tBank.trim();
    }

    public String gettBankAccount() {
        return tBankAccount;
    }

    public void settBankAccount(String tBankAccount) {
        this.tBankAccount = tBankAccount == null ? null : tBankAccount.trim();
    }

    public String gettBankAccountname() {
        return tBankAccountname;
    }

    public void settBankAccountname(String tBankAccountname) {
        this.tBankAccountname = tBankAccountname == null ? null : tBankAccountname.trim();
    }

    public Integer gettSort() {
        return tSort;
    }

    public void settSort(Integer tSort) {
        this.tSort = tSort;
    }

    public String gettRemark() {
        return tRemark;
    }

    public void settRemark(String tRemark) {
        this.tRemark = tRemark == null ? null : tRemark.trim();
    }
}