package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName(value = "t_warehouse")
public class Warehouse implements Serializable {

    /**
     * 主键
     */
    @TableId(value = "t_id", type = IdType.AUTO)
    private Integer tId;

    /**
     * 仓库名称
     */
    @TableField(value = "t_name")
    private String tName;

    /**
     * 负责人
     */
    @TableField(value = "t_leader")
    private String tLeader;

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

    /**
     * 状态
     */
    @TableField(value = "t_status")
    private Boolean tStatus;

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

    public Boolean gettStatus() {
        return tStatus;
    }

    public void settStatus(Boolean tStatus) {
        this.tStatus = tStatus;
    }
}