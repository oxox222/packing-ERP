package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.model.Warehouse;
import com.plz.modules.entity.WarehouseListDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WarehouseMapper extends BaseMapper<Warehouse> {

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    List<WarehouseListDto> selectList(@Param("status") Boolean status);

    Warehouse queryDetails(@Param("id") int id);
}