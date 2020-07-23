package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: User
 * @Description: 用户
 * @Author: PANLVZ
 * @Date: 2020/7/22
 */
@Data
@TableName(value = "t_user")
public class User {

    @TableId(value = "uid", type = IdType.AUTO)
    @ApiModelProperty(value = "主键")
    private Integer uid;

    @TableField(value = "userName")
    @ApiModelProperty(value = "用户名")
    private String userName;

    @TableField(value = "password")
    @ApiModelProperty(value = "密码")
    private String password;

    @TableField(value = "create_time")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @TableField(value = "last_login_time")
    @ApiModelProperty(value = "最后登录时间")
    private Date lastLoginTime;

    private Set<Role> roles = new HashSet<>();

}
