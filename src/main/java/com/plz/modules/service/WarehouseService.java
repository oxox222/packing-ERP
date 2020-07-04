package com.plz.modules.service;

import com.github.pagehelper.PageInfo;
import com.plz.modules.model.StatusBaseQuery;
import com.plz.modules.model.Warehouse;
import com.plz.modules.entity.WarehouseListDTO;

import java.util.List;

public interface WarehouseService {

    /**
     * 新增仓库
     * @param warehouse
     */
    void addWarehouse(Warehouse warehouse);

    /**
     * 查询仓库列表
     * @param statusBaseQuery
     * @return
     */
    PageInfo<List<WarehouseListDTO>> queryWarehouseList(StatusBaseQuery statusBaseQuery);

    /**
     * 查询仓库详情
     * @param id
     * @return
     */
    Warehouse queryWarehouseDetails(int id);

    /**
     * 编辑仓库
     * @param warehouse
     */
    void updateWarehouse(Warehouse warehouse);
}
