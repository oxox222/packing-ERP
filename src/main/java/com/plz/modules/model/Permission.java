package com.plz.modules.model;

import lombok.Data;

/**
 * @ClassName: Permission
 * @Description: 权限
 * @Author: PANLVZ
 * @Date: 2020/7/22
 */
@Data
public class Permission {

    /**
     * 主键
     */
    private Integer pid;

    /**
     * 权限
     */
    private String name;

    /**
     * 路径
     */
    private String url;
}
