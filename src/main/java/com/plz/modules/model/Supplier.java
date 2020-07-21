package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@TableName(value = "t_supplier")
@ApiModel(value = "供应商")
public class Supplier implements Serializable {

    /**
     * 主键
     */
    @TableId(value = "t_id", type = IdType.AUTO)
    @ApiModelProperty(value = "主键", required = true)
    private Integer tId;

    /**
     * 供应商名称
     */
    @TableField(value = "t_name")
    @ApiModelProperty(value = "供应商名称", required = true)
    private String tName;

    /**
     * 负责人
     */
    @TableField(value = "t_leader")
    @ApiModelProperty(value = "负责人")
    private String tLeader;

    /**
     * 折扣
     */
    @TableField(value = "t_discount")
    @ApiModelProperty(value = "折扣", required = true)
    private Float tDiscount;

    /**
     * 手机号
     */
    @TableField(value = "t_mobilPhone")
    @ApiModelProperty(value = "手机号")
    private String tMobilphone;

    /**
     * 电话号
     */
    @TableField(value = "t_phone")
    @ApiModelProperty(value = "电话号")
    private String tPhone;

    /**
     * 邮箱
     */
    @TableField(value = "t_mail")
    @ApiModelProperty(value = "邮箱")
    private String tMail;

    /**
     * 传真号码
     */
    @TableField(value = "t_fax")
    @ApiModelProperty(value = "传真号码")
    private String tFax;

    /**
     * 网址
     */
    @TableField(value = "t_website")
    @ApiModelProperty(value = "网址")
    private String tWebsite;

    /**
     * 地区 ,分割
     */
    @TableField(value = "t_addr")
    @ApiModelProperty(value = "地区 ,分割")
    private String tAddr;

    /**
     * 详细地址
     */
    @TableField(value = "t_addrDetail")
    @ApiModelProperty(value = "详细地址")
    private String tAddrdetail;

    /**
     * 开户银行
     */
    @TableField(value = "t_bank")
    @ApiModelProperty(value = "开户银行")
    private String tBank;

    /**
     * 银行账号
     */
    @TableField(value = "t_bank_account")
    @ApiModelProperty(value = "银行账号")
    private String tBankAccount;

    /**
     * 银行账户名
     */
    @TableField(value = "t_bank_accountName")
    @ApiModelProperty(value = "银行账户名")
    private String tBankAccountname;

    /**
     * 排序字段
     */
    @TableField(value = "t_sort")
    @ApiModelProperty(value = "排序字段")
    private Integer tSort;

    /**
     * 备注
     */
    @TableField(value = "t_remark")
    @ApiModelProperty(value = "备注")
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