package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName: CollectionRecord
 * @Description: 收款
 * @Author: PANLVZ
 * @Date: 2022/1/1
 */
@Data
@TableName("t_collection_record")
public class CollectionRecord {

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
     * 收款金额
     */
    @TableField("t_collection")
    private Double collection;

    /**
     * 收款时间
     */
    @TableField("t_collection_time")
    private Date collectionTime;

    /**
     * 货款年月
     */
    @TableField("t_goods_time")
    private Date goodsTime;
}
