package com.plz.modules.service;

import com.plz.modules.model.Supplier;
import com.plz.modules.vo.SupplierQueryVo;

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
    List<Supplier> querySupplierList(SupplierQueryVo query);

    /**
     * 编辑供应商信息
     * @param supplier
     */
    void updateSupplier(Supplier supplier);

    /**
     * 根据id删除
     * @param id
     */
    void deleteById(int id);
}
