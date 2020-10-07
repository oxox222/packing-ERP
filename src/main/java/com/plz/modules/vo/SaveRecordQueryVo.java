package com.plz.modules.vo;

import com.plz.modules.entity.PageBase;
import lombok.Data;

/**
 * @ClassName: SaveRecordQueryVo
 * @Description: 入库查询条件
 * @Author: PANLVZ
 * @Date: 2020/7/17
 */
@Data
public class SaveRecordQueryVo extends PageBase {

    /**
     * 仓库表id
     */
    private Integer warehouseId;

    /**
     * 单号
     */
    private String odd;
}
