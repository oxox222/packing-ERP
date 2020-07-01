package com.plz.modules.model;

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
     * 当前页
     */
    private int pageNum;

    /**
     * 每页大小
     */
    private int pageSize;
}
