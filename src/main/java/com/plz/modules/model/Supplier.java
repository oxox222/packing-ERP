package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@TableName(value = "t_supplier")
@ApiModel(value = "供应商")
@Data
public class Supplier implements Serializable {

    /**
     * 主键
     */
    @TableId(value = "t_id")
    @ApiModelProperty(value = "主键", required = true)
    private Integer id;

    /**
     * 供应商名称
     */
    @TableField(value = "t_name")
    @ApiModelProperty(value = "供应商名称", required = true)
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
    @ApiModelProperty(value = "负责人联系方式")
    private String leaderPhone;

    /**
     * 供应商电话
     */
    @TableField(value = "t_phone")
    @ApiModelProperty(value = "电话号")
    private String phone;

    /**
     * 邮箱
     */
    @TableField(value = "t_mail")
    @ApiModelProperty(value = "邮箱")
    private String mail;

    /**
     * 传真号码
     */
    @TableField(value = "t_fax")
    @ApiModelProperty(value = "传真号码")
    private String fax;

    /**
     * 网址
     */
    @TableField(value = "t_website")
    @ApiModelProperty(value = "网址")
    private String website;

    /**
     * 地区 ,分割
     */
    @TableField(value = "t_addr")
    @ApiModelProperty(value = "地区 ,分割")
    private String address;

    /**
     * 详细地址
     */
    @TableField(value = "t_addr_detail")
    @ApiModelProperty(value = "详细地址")
    private String addressDetail;

    /**
     * 开户银行
     */
    @TableField(value = "t_bank")
    @ApiModelProperty(value = "开户银行")
    private String bank;

    /**
     * 银行账号
     */
    @TableField(value = "t_bank_account")
    @ApiModelProperty(value = "银行账号")
    private String bankAccount;

    /**
     * 银行账户名
     */
    @TableField(value = "t_bank_accountName")
    @ApiModelProperty(value = "银行账户名")
    private String bankAccountName;

    /**
     * 排序字段
     */
    @TableField(value = "t_sort")
    @ApiModelProperty(value = "排序字段")
    private Byte sort;

    /**
     * 备注
     */
    @TableField(value = "t_remark")
    @ApiModelProperty(value = "备注")
    private String remark;

    private static final long serialVersionUID = 1L;

}