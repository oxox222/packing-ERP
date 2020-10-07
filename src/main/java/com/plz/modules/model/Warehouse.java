package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName(value = "t_warehouse")
@Data
public class Warehouse implements Serializable {

    /**
     * 主键
     */
    @TableId(value = "t_id")
    private Integer id;

    /**
     * 仓库名称
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