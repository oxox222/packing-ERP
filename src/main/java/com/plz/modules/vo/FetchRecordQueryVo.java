package com.plz.modules.vo;

import com.plz.modules.entity.PageBase;
import lombok.Data;

/**
 * @ClassName: FetchRecordQueryVo
 * @Description: 出库查询条件
 * @Author: PANLVZ
 * @Date: 2020/10/2
 */
@Data
public class FetchRecordQueryVo extends PageBase {

    /**
     * 仓库表id
     */
    private Integer warehouseId;

    /**
     * 单号
     */
    private String odd;

    /**
     * 顾客id
     */
    private Integer customId;

}
