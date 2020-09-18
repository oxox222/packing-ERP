package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@TableName(value = "t_warehouse")
@ApiModel(value = "仓库")
@Data
public class Warehouse implements Serializable {

    /**
     * 主键
     */
    @TableId(value = "t_id")
    @ApiModelProperty(value = "主键", required = true)
    private Integer id;

    /**
     * 仓库名称
     */
    @TableField(value = "t_name")
    @ApiModelProperty(value = "仓库名称", required = true)
    private String name;

    /**
     * 负责人
     */
    @TableField(value = "t_leader")
    @ApiModelProperty(value = "负责人", required = true)
    private String leader;

    /**
     * 负责人联系方式
     */
    @TableField(value = "t_leader_phone")
    @ApiModelProperty(value = "负责人联系方式")
    private String leaderPhone;

    /**
     * 排序
     */
    @TableField(value = "t_sort")
    @ApiModelProperty(value = "排序")
    private Byte sort;

    /**
     * 备注
     */
    @TableField(value = "t_remark")
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     * 状态
     */
    @TableField(value = "t_status")
    @ApiModelProperty(value = "状态", required = true)
    private Byte status;

    private static final long serialVersionUID = 1L;
}