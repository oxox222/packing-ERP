package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: Declaration
 * @Description: 报单
 * @Author: PANLVZ
 * @Date: 2021/5/3
 */
@Data
@TableName("t_declaration")
public class Declaration {

    /**
     * 主键
     */
    @TableId("t_id")
    private Integer id;

    /**
     * 顾客id
     */
    @TableField("t_customId")
    private Integer customId;

    /**
     * 交货方id
     */
    @TableField("t_receivedId")
    private Integer receivedId;

    /**
     * 收货联系人
     */
    @TableField("t_receiver")
    private String receiver;

    /**
     * 收货联系人联系方式
     */
    @TableField("t_receiver_phone")
    private String receiverPhone;

    /**
     * 收货地址
     */
    @TableField("t_received_address")
    private String receivedAddress;

    /**
     * 备注
     */
    @TableField("t_remark")
    private String remark;

    /**
     * 报单日期
     */
    @TableField("t_declaration_date")
    private Date declarationDate;

    /**
     * 发货日期
     */
    @TableField("t_deliver_date")
    private Date deliverDate;

    /**
     * 创建人
     */
    @TableField("t_createId")
    private Integer createId;

    /**
     * 创建时间
     */
    @TableField("t_create_time")
    private Date createTime;

    /**
     * 最后修改人
     */
    @TableField("t_updateId")
    private Integer updateId;

    /**
     * 最后修改时间
     */
    @TableField("t_update_time")
    private Date updateTime;

    /**
     * 报单商品集合
     */
    @TableField(exist = false)
    List<DeclarationGoods> declarationGoodsList = new ArrayList();
}
