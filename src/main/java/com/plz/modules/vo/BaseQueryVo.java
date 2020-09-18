package com.plz.modules.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName: BaseQueryVo
 * @Description: 基础查询条件
 * @Author: PANLVZ
 * @Date: 2020/8/19
 */
@Data
public class BaseQueryVo extends PageBaseQueryVo {

    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("状态")
    private Byte status;

    @ApiModelProperty("类型")
    private Byte type;
}
