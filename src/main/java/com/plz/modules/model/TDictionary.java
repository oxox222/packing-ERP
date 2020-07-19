package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("t_dictionary")
public class TDictionary implements Serializable {

    @TableField("t_type")
    private String tType;

    @TableField("t_code")
    private String tCode;

    @TableField("t_name")
    private String tName;

    @TableField("t_description")
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