package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.model.Supplier;

import java.util.List;

public interface SupplierMapper extends BaseMapper<Supplier> {
    int insert(Supplier record);

    int insertSelective(Supplier record);

    List<Supplier> queryList();
}