package com.plz.modules.service;

import com.plz.modules.model.Warehouse;
import com.plz.modules.vo.WarehouseQueryVo;

import java.util.List;

public interface WarehouseService {

    /**
     * 新增仓库
     * @param warehouse
     */
    void addWarehouse(Warehouse warehouse);

    /**
     * 查询仓库列表
     * @param query
     * @return
     */
    List<Warehouse> queryWarehouseList(WarehouseQueryVo query);

    /**
     * 编辑仓库
     * @param warehouse
     */
    void updateWarehouse(Warehouse warehouse);

    /**
     * 根据id删除
     * @param id
     */
    void deleteById(int id);
}
