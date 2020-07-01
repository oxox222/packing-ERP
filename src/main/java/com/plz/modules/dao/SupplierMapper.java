package com.plz.modules.dao;

import com.plz.modules.model.Supplier;

public interface SupplierMapper {
    int insert(Supplier record);

    int insertSelective(Supplier record);
}