package com.plz.modules.service;

import com.plz.modules.model.Supplier;
import com.plz.modules.vo.SupplierQueryVo;

import java.util.List;

public interface SupplierService {

    /**
     * 新增供货商
     * @param supplier
     * @return
     */
    Integer insert(Supplier supplier);

    /**
     * 查询供应商列表
     * @return
     */
    List<Supplier> list(SupplierQueryVo query);

    /**
     * 编辑供应商信息
     * @param supplier
     */
    void update(Supplier supplier);

    /**
     * 根据id删除
     * @param id
     */
    void delete(int id);
}
