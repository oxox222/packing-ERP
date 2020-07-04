package com.plz.modules.service;

import com.github.pagehelper.PageInfo;
import com.plz.modules.model.Supplier;

import java.util.List;

public interface SupplierService {

    /**
     * 新增供货商
     * @param supplier
     */
    void addSupplier(Supplier supplier);

    /**
     * 查询供应商列表
     * @return
     */
    PageInfo<List<Supplier>> querySupplierList(int pageNum, int pageSize);

    /**
     * 编辑供应商信息
     * @param supplier
     */
    void updateSupplier(Supplier supplier);
}
