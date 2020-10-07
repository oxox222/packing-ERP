package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("t_custom")
@Data
public class Custom implements Serializable {

    /**
     * 主键
     */
    @TableId(value = "t_id")
    private Integer id;

    /**
     * 客户名称
     */
    @TableField(value = "t_name")
    private String name;

    /**
     * 负责人
     */
    @TableField(value = "t_leader")
    private String leader;

    /**
     * 负责人联系方式
     */
    @TableField(value = "t_leader_phone")
    private String leaderPhone;

    /**
     * 电话
     */
    @TableField(value = "t_phone")
    private String phone;

    /**
     * 邮箱
     */
    @TableField(value = "t_mail")
    private String mail;

    /**
     * 传真
     */
    @TableField(value = "t_fax")
    private String fax;

    /**
     * 所属地区
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
     * 银行账户
     */
    @TableField(value = "t_bank_account_name")
    private String bankAccountName;

    /**
     * 银行账号
     */
    @TableField(value = "t_bank_account")
    private String bankAccount;

    /**
     * 排序
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