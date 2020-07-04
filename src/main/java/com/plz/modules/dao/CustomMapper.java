package com.plz.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.model.Custom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomMapper extends BaseMapper<Custom> {

    int insert(Custom record);

    int insertSelective(Custom record);

    List<Custom> queryList(@Param("status") Boolean status);
}