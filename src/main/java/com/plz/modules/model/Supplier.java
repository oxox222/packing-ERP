package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@TableName(value = "t_supplier")
@Data
public class Supplier implements Serializable {

    /**
     * 主键
     */
    @TableId(value = "t_id")
    private Integer id;

    /**
     * 供应商名称
     */
    @TableField(value = "t_name")
    private String name;

    /**
     * 负责人
     */
    @TableField(value = "t_leader")
    @ApiModelProperty(value = "负责人")
    private String leader;

    /**
     * 负责人联系方式
     */
    @TableField(value = "t_leader_phone")
    private String leaderPhone;

    /**
     * 供应商电话
     */
    @TableField(value = "t_phone")
    private String phone;

    /**
     * 邮箱
     */
    @TableField(value = "t_mail")
    private String mail;

    /**
     * 传真号码
     */
    @TableField(value = "t_fax")
    private String fax;

    /**
     * 网址
     */
    @TableField(value = "t_website")
    private String website;

    /**
     * 地区 ,分割
     */
    @TableField(value = "t_addr")
    private String address;

    /**
     * 详细地址
     */
    @TableField(value = "t_addr_detail")
    private String addressDetail;

    /**
     * 开户银行
     */
    @TableField(value = "t_bank")
    private String bank;

    /**
     * 银行账号
     */
    @TableField(value = "t_bank_account")
    private String bankAccount;

    /**
     * 银行账户名
     */
    @TableField(value = "t_bank_accountName")
    private String bankAccountName;

    /**
     * 排序字段
     */
    @TableField(value = "t_sort")
    private Byte sort;

    /**
     * 备注
     */
    @TableField(value = "t_remark")
    private String remark;

    private static final long serialVersionUID = 1L;

}