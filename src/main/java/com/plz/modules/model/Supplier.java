package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName(value = "t_supplier")
public class Supplier implements Serializable {

    /**
     * 主键
     */
    @TableId(value = "t_id", type = IdType.AUTO)
    private Integer tId;

    /**
     * 供应商名称
     */
    @TableField(value = "t_name")
    private String tName;

    /**
     * 负责人
     */
    @TableField(value = "t_leader")
    private String tLeader;

    /**
     * 折扣
     */
    @TableField(value = "t_discount")
    private Float tDiscount;

    /**
     * 手机号
     */
    @TableField(value = "t_mobilPhone")
    private String tMobilphone;

    /**
     * 电话号
     */
    @TableField(value = "t_phone")
    private String tPhone;

    /**
     * 邮箱
     */
    @TableField(value = "t_mail")
    private String tMail;

    /**
     * 传真号码
     */
    @TableField(value = "t_fax")
    private String tFax;

    /**
     * 网址
     */
    @TableField(value = "t_website")
    private String tWebsite;

    /**
     * 地区 ,分割
     */
    @TableField(value = "t_addr")
    private String tAddr;

    /**
     * 详细地址
     */
    @TableField(value = "t_addrDetail")
    private String tAddrdetail;

    /**
     * 开户银行
     */
    @TableField(value = "t_bank")
    private String tBank;

    /**
     * 银行账号
     */
    @TableField(value = "t_bank_account")
    private String tBankAccount;

    /**
     * 银行账户名
     */
    @TableField(value = "t_bank_accountName")
    private String tBankAccountname;

    /**
     * 排序字段
     */
    @TableField(value = "t_sort")
    private Integer tSort;

    /**
     * 备注
     */
    @TableField(value = "t_remark")
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