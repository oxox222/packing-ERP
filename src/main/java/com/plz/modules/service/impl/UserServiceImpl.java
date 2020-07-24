package com.plz.modules.service.impl;

import com.plz.modules.mapper.UserMapper;
import com.plz.modules.model.User;
import com.plz.modules.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: UserServiceImpl
 * @Description: 用户
 * @Author: PANLVZ
 * @Date: 2020/7/22
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findByUserName(String userName) {
        return userMapper.findByUserName(userName);
    }
}
