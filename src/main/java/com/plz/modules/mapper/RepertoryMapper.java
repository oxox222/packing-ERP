package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.entity.RepertoryDto;
import com.plz.modules.model.Repertory;
import com.plz.modules.vo.RepertoryQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepertoryMapper extends BaseMapper<Repertory> {

    /**
     * 查询库存
     * @param query
     * @return
     */
    List<RepertoryDto> getRepertory(@Param("query") RepertoryQueryVo query);
}
