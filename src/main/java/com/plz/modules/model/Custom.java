package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@TableName("t_custom")
@ApiModel("客户")
public class Custom implements Serializable {

    /**
     * 主键
     */
    @TableId(value = "t_id", type = IdType.AUTO)
    @ApiModelProperty(value = "主键", required = true)
    private Integer tId;

    /**
     * 客户名称
     */
    @TableField(value = "t_name")
    @ApiModelProperty(value = "客户名称", required = true)
    private String tName;

    /**
     * 联系人
     */
    @TableField(value = "t_contacts")
    @ApiModelProperty(value = "联系人")
    private String tContacts;

    /**
     * 联系人手机号码
     */
    @TableField(value = "t_mobilPhone")
    @ApiModelProperty(value = "联系人手机号码")
    private String tMobilphone;

    /**
     * 客户类型
     */
    @TableField(value = "t_customType")
    @ApiModelProperty(value = "客户类型")
    private Integer tCustomtype;

    /**
     * 是否启用
     */
    @TableField(value = "t_status")
    @ApiModelProperty(value = "是否启用", required = true)
    private Boolean tStatus;

    /**
     * 折扣
     */
    @TableField(value = "t_discount")
    @ApiModelProperty(value = "折扣")
    private Float tDiscount;

    /**
     * 所属销售员
     */
    @TableField(value = "t_salesmanId")
    @ApiModelProperty(value = "所属销售员")
    private Integer tSalesmanid;

    /**
     * 电话
     */
    @TableField(value = "t_phone")
    @ApiModelProperty(value = "电话")
    private String tPhone;

    /**
     * 邮箱
     */
    @TableField(value = "t_mail")
    @ApiModelProperty(value = "邮箱")
    private String tMail;

    /**
     * 传真
     */
    @TableField(value = "t_fax")
    @ApiModelProperty(value = "传真")
    private String tFax;

    /**
     * 所属地区
     */
    @TableField(value = "t_addr")
    @ApiModelProperty(value = "所属地区")
    private String tAddr;

    /**
     * 详细地址
     */
    @TableField(value = "t_addrDetail")
    @ApiModelProperty(value = "详细地址")
    private String tAddrdetail;

    /**
     * 送货方式
     */
    @TableField(value = "t_deliverWay")
    @ApiModelProperty(value = "送货方式")
    private String tDeliverway;

    /**
     * 开户银行
     */
    @TableField(value = "t_bank")
    @ApiModelProperty(value = "开户银行")
    private String tBank;

    /**
     * 银行账户
     */
    @TableField(value = "t_bankAccountName")
    @ApiModelProperty(value = "银行账户")
    private String tBankaccountname;

    /**
     * 银行账号
     */
    @TableField(value = "t_bankAccount")
    @ApiModelProperty(value = "银行账号")
    private String tBankaccount;

    /**
     * 排序
     */
    @TableField(value = "t_sort")
    @ApiModelProperty(value = "排序")
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

    public String gettContacts() {
        return tContacts;
    }

    public void settContacts(String tContacts) {
        this.tContacts = tContacts == null ? null : tContacts.trim();
    }

    public String gettMobilphone() {
        return tMobilphone;
    }

    public void settMobilphone(String tMobilphone) {
        this.tMobilphone = tMobilphone == null ? null : tMobilphone.trim();
    }

    public Integer gettCustomtype() {
        return tCustomtype;
    }

    public void settCustomtype(Integer tCustomtype) {
        this.tCustomtype = tCustomtype;
    }

    public Boolean gettStatus() {
        return tStatus;
    }

    public void settStatus(Boolean tStatus) {
        this.tStatus = tStatus;
    }

    public Float gettDiscount() {
        return tDiscount;
    }

    public void settDiscount(Float tDiscount) {
        this.tDiscount = tDiscount;
    }

    public Integer gettSalesmanid() {
        return tSalesmanid;
    }

    public void settSalesmanid(Integer tSalesmanid) {
        this.tSalesmanid = tSalesmanid;
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

    public String gettDeliverway() {
        return tDeliverway;
    }

    public void settDeliverway(String tDeliverway) {
        this.tDeliverway = tDeliverway == null ? null : tDeliverway.trim();
    }

    public String gettBank() {
        return tBank;
    }

    public void settBank(String tBank) {
        this.tBank = tBank == null ? null : tBank.trim();
    }

    public String gettBankaccountname() {
        return tBankaccountname;
    }

    public void settBankaccountname(String tBankaccountname) {
        this.tBankaccountname = tBankaccountname == null ? null : tBankaccountname.trim();
    }

    public String gettBankaccount() {
        return tBankaccount;
    }

    public void settBankaccount(String tBankaccount) {
        this.tBankaccount = tBankaccount == null ? null : tBankaccount.trim();
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