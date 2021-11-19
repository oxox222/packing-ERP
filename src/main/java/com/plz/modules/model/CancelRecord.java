package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 退货单表
 * Created by PANLVZ on 2021/11/19
 */
@Data
@TableName("t_cancel_record")
public class CancelRecord {

    /**
     * 主键
     */
    @TableId("t_id")
    private Integer id;

    /**
     * 顾客id
     */
    @TableField("t_custom_id")
    private Integer customId;

    /**
     * 退货方id
     */
    @TableField("t_cancel_person_id")
    private Integer cancelPersonId;

    /**
     * 退货时间
     */
    @TableField("t_cancel_time")
    private Date cancelTime;

    /**
     * 备注
     */
    @TableField(value = "t_remark")
    private String remark;

}
