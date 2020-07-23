package com.plz.modules.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName: Permission
 * @Description: 权限
 * @Author: PANLVZ
 * @Date: 2020/7/22
 */
@Data
public class Permission {

    @ApiModelProperty(value = "主键")
    private Integer pid;

    @ApiModelProperty(value = "权限")
    private String name;

    @ApiModelProperty(value = "路径")
    private String url;
}
