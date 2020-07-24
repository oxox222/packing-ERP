package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<UserMapper> {

    User findByUserName(@Param("userName") String userName);
}
