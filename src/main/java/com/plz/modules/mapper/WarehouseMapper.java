package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.model.Warehouse;
import com.plz.modules.vo.WarehouseQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WarehouseMapper extends BaseMapper<Warehouse> {

    /**
     * 查询仓库列表
     * @param query
     * @return
     */
    List<Warehouse> list(@Param("query") WarehouseQueryVo query);

}