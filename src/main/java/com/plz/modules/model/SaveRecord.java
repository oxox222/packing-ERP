package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: SaveRecord
 * @Description: 入库记录
 * @Author: PANLVZ
 * @Date: 2020/10/2
 */
@Data
@TableName("t_save_record")
public class SaveRecord implements Serializable {

    /**
     * 主键
     */
    @TableId("t_id")
    private Integer id;

    /**
     * 单号
     */
    @TableField("t_odd")
    private String odd;

    /**
     * 仓库id
     */
    @TableField("t_warehouseId")
    private Integer warehouseId;

    /**
     * 折扣
     */
    @TableField("t_discount")
    private Float discount;

    /**
     * 实付金额
     */
    @TableField("t_paid")
    private Double paid;

    /**
     * 备注
     */
    @TableField("t_remark")
    private String remark;

    /**
     * 供应商id
     */
    @TableField("t_supplierId")
    private Integer supplierId;

    /**
     * 签收人
     */
    @TableField("t_signer")
    private String signer;

    /**
     * 收货时间
     */
    @TableField("t_received_time")
    private Date receivedTime;

    /**
     * 创建时间
     */
    @TableField("t_create_time")
    private Date createTime;

    /**
     * 入库商品集合
     */
    @TableField(exist = false)
    List<SaveGoodsRecord> saveGoodsRecordList = new ArrayList<>();
}