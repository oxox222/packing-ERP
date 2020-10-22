package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.model.Statistics;

import java.util.List;

public interface StatisticsMapper extends BaseMapper<Statistics> {

    /**
     * 查询列表
     * @return
     */
    List<Statistics> list();
}
