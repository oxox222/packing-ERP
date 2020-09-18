package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.model.Custom;
import com.plz.modules.vo.CustomQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomMapper extends BaseMapper<Custom> {

    List<Custom> queryList(@Param("query") CustomQueryVo query);
}