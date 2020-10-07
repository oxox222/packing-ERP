package com.plz.modules.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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

    @TableId(value = "uid")
    private Integer uid;

    @TableField(value = "userName")
    private String userName;

    @TableField(value = "password")
    private String password;

    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "last_login_time")
    private Date lastLoginTime;

    private Set<Role> roles = new HashSet<>();

}
