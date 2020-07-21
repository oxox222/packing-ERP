package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@TableName("t_dictionary")
@ApiModel("字典")
public class TDictionary implements Serializable {

    @TableField("t_type")
    @ApiModelProperty(value = "字典类型")
    private String tType;

    @TableField("t_code")
    @ApiModelProperty(value = "字典值")
    private String tCode;

    @TableField("t_name")
    @ApiModelProperty(value = "字典名称")
    private String tName;

    @TableField("t_description")
    @ApiModelProperty(value = "字典描述")
    private String tDescription;

    private static final long serialVersionUID = 1L;

    public String gettType() {
        return tType;
    }

    public void settType(String tType) {
        this.tType = tType == null ? null : tType.trim();
    }

    public String gettCode() {
        return tCode;
    }

    public void settCode(String tCode) {
        this.tCode = tCode == null ? null : tCode.trim();
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettDescription() {
        return tDescription;
    }

    public void settDescription(String tDescription) {
        this.tDescription = tDescription == null ? null : tDescription.trim();
    }
}