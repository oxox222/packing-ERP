package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.entity.RepertoryDto;
import com.plz.modules.model.Repertory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepertoryMapper extends BaseMapper<Repertory> {

    /**
     * 查询库存
     * @param id
     * @return
     */
    List<RepertoryDto> getRepertory(@Param("id") Integer id);
}
