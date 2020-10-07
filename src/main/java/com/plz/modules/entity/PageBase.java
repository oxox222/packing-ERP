package com.plz.modules.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName: PageBase
 * @Description: 分页基础参数
 * @Author: PANLVZ
 * @Date: 2020/7/1
 */
@Getter
@Setter
public class PageBase {

    /**
     * 当前页 默认1
     */
    private Long pageNum = 1L;

    /**
     * 每页大小 默认10
     */
    private Long pageSize = 10L;
}
