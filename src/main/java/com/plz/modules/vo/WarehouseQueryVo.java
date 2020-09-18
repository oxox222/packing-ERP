package com.plz.modules.vo;

import lombok.Data;

/**
 * @ClassName: WarehouseQueryVo
 * @Description: 仓库管理列表查询条件
 * @Author: PANLVZ
 * @Date: 2020/9/17
 */
@Data
public class WarehouseQueryVo {

    /**
     * 仓库名称
     */
    private String name;

    /**
     * 仓库负责人
     */
    private String leader;

    /**
     * 状态 (1启用, 0不启用)
     */
    private Byte status;
}
