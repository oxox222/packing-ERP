package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.model.Supplier;
import com.plz.modules.vo.SupplierQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplierMapper extends BaseMapper<Supplier> {

    List<Supplier> list(@Param("query") SupplierQueryVo query);
}