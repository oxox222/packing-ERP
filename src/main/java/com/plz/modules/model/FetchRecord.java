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
 * @ClassName: FetchRecord
 * @Description: 出库记录
 * @Author: PANLVZ
 * @Date: 2020/10/2
 */
@Data
@TableName("t_fetch_record")
public class FetchRecord implements Serializable {

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
     * 其他费用
     */
    @TableField("t_other_cost")
    private Double otherCost;

    /**
     * 其他费用名称
     */
    @TableField("t_other_cost_name")
    private String otherCostName;

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
     * 顾客id
     */
    @TableField("t_customId")
    private Integer customId;

    /**
     * 签收人
     */
    @TableField("t_signer")
    private String signer;

    /**
     * 交货联系人
     */
    @TableField("t_receiver")
    private String receiver;

    /**
     * 交货联系人联系方式
     */
    @TableField("t_receiver_phone")
    private String receiverPhone;

    /**
     * 交货方id
     */
    @TableField("t_receivedId")
    private Integer receiverId;

    /**
     * 交货地址
     */
    @TableField("t_received_address")
    private String receivedAddress;

    /**
     * 交货时间
     */
    @TableField("t_received_time")
    private Date receivedTime;

    /**
     * 开单时间
     */
    @TableField("t_deal_time")
    private Date dealTime;

    /**
     * 订单状态 1备货中;2已发货;3已签收
     */
    @TableField("t_state")
    private Byte state;

    /**
     * 创建时间
     */
    @TableField("t_create_time")
    private Date createTime;

    /**
     * 出库商品集合
     */
    @TableField(exist = false)
    List<FetchGoodsRecord> fetchGoodsRecordList = new ArrayList<>();
}