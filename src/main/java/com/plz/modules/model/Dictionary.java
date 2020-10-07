package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("t_dictionary")
@Data
public class Dictionary implements Serializable {

    /**
     * 字典类型
     */
    @TableField("t_type")
    private String type;

    /**
     * 字典值
     */
    @TableField("t_code")
    private String code;

    /**
     * 字典名称
     */
    @TableField("t_name")
    private String name;

    /**
     * 字典描述
     */
    @TableField("t_description")
    private String description;
}