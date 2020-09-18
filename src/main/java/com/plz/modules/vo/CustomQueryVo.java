package com.plz.modules.vo;

import lombok.Data;

/**
 * @ClassName: CustomQueryVo
 * @Description: 客户列表查询条件
 * @Author: PANLVZ
 * @Date: 2020/9/17
 */
@Data
public class CustomQueryVo {

    /**
     * 客户姓名
     */
    private String name;

    /**
     * 状态 是否启用(1启用, 0不启用)
     */
    private Byte status;
}
