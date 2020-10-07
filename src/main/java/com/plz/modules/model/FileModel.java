package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName: FileModel
 * @Description: 文件
 * @Author: PANLVZ
 * @Date: 2020/9/18
 */
@Data
@TableName("t_file")
public class FileModel {

    /**
     * 主键id
     */
    @TableId(value = "t_id")
    private Integer id;

    /**
     * 地址
     */
    @TableField(value = "t_url")
    private String url;

    /**
     * 原文件名
     */
    @TableField(value = "t_origin_name")
    private String originName;

    /**
     * 现文件名
     */
    @TableField(value = "t_new_name")
    private String newName;

    /**
     * 后缀名
     */
    @TableField(value = "t_suffix_name")
    private String suffixName;

    /**
     * 文件类型 1图片,2Excel,3word,9其他
     */
    @TableField(value = "t_file_type")
    private Byte fileType;

    /**
     * 对应所属类型 1出库单,2入库单,3商品
     */
    @TableField(value = "t_origin_type")
    private Byte originType;

    /**
     * 对应所属主键
     */
    @TableField(value = "t_origin_id")
    private Integer originId;

    /**
     * 创建时间
     */
    @TableField(value = "t_create_time")
    private Date createTime;

}
