package com.plz.modules.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: Role
 * @Description: 角色
 * @Author: PANLVZ
 * @Date: 2020/7/22
 */
@Data
public class Role {

    @ApiModelProperty(value = "主键")
    private Integer rid;

    @ApiModelProperty(value = "角色名")
    private String name;

    private Set<Permission> permissions = new HashSet<>();

    private Set<User> users = new HashSet<>();
}
