package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("t_custom")
public class Custom implements Serializable {

    /**
     * 主键
     */
    @TableId(value = "t_id", type = IdType.AUTO)
    private Integer tId;

    /**
     * 客户名称
     */
    @TableField(value = "t_name")
    private String tName;

    /**
     * 联系人
     */
    @TableField(value = "t_contacts")
    private String tContacts;

    /**
     * 联系人手机号码
     */
    @TableField(value = "t_mobilPhone")
    private String tMobilphone;

    /**
     * 客户类型
     */
    @TableField(value = "t_customType")
    private Integer tCustomtype;

    /**
     * 是否启用
     */
    @TableField(value = "t_status")
    private Boolean tStatus;

    /**
     * 折扣
     */
    @TableField(value = "t_discount")
    private Float tDiscount;

    /**
     * 所属销售员
     */
    @TableField(value = "t_salesmanId")
    private Integer tSalesmanid;

    /**
     * 电话
     */
    @TableField(value = "t_phone")
    private String tPhone;

    /**
     * 邮箱
     */
    @TableField(value = "t_mail")
    private String tMail;

    /**
     * 传真
     */
    @TableField(value = "t_fax")
    private String tFax;

    /**
     * 所属地区
     */
    @TableField(value = "t_addr")
    private String tAddr;

    /**
     * 详细地址
     */
    @TableField(value = "t_addrDetail")
    private String tAddrdetail;

    /**
     * 送货方式
     */
    @TableField(value = "t_deliverWay")
    private String tDeliverway;

    /**
     * 开户银行
     */
    @TableField(value = "t_bank")
    private String tBank;

    /**
     * 银行账户
     */
    @TableField(value = "t_bankAccountName")
    private String tBankaccountname;

    /**
     * 银行账号
     */
    @TableField(value = "t_bankAccount")
    private String tBankaccount;

    /**
     * 排序
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