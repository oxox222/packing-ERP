package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@TableName("t_dictionary")
@ApiModel("字典")
@Data
public class Dictionary implements Serializable {

    @TableField("t_type")
    @ApiModelProperty(value = "字典类型")
    private String type;

    @TableField("t_code")
    @ApiModelProperty(value = "字典值")
    private String code;

    @TableField("t_name")
    @ApiModelProperty(value = "字典名称")
    private String name;

    @TableField("t_description")
    @ApiModelProperty(value = "字典描述")
    private String description;
}