package com.plz.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.model.Warehouse;
import com.plz.modules.vo.WarehouseListVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WarehouseMapper extends BaseMapper<Warehouse> {

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    List<WarehouseListVo> selectList();

    Warehouse queryDetails(@Param("id") int id);
}