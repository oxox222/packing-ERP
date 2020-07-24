package com.plz.modules.vo;

import io.swagger.annotations.ApiModelProperty;
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
public class PageBaseQueryVo {

    /**
     * 当前页
     */
    @ApiModelProperty(value = "当前页")
    private int pageNum = 1;

    /**
     * 每页大小
     */
    @ApiModelProperty("每页大小")
    private int pageSize = 10;
}
