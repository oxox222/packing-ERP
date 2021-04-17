package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName: FetchSaveRecord
 * @Description: 出入库关联表
 * @Author: PANLVZ
 * @Date: 2021/4/17
 */
@Data
@TableName("t_fetch_save_record")
public class FetchSaveRecord {

    /**
     * 主键
     */
    @TableId("t_id")
    private Integer id;

    /**
     * 出库单id
     */
    @TableField("t_fetch_id")
    private Integer fetchId;

    /**
     * 入库单id
     */
    @TableField("t_save_id")
    private Integer saveId;
}
