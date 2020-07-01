package com.plz.modules.service;

import com.github.pagehelper.PageInfo;
import com.plz.modules.model.Warehouse;
import com.plz.modules.vo.WarehouseListVo;

import java.util.List;

public interface WarehouseService {

    /**
     * 新增仓库
     * @param warehouse
     */
    void addWarehouse(Warehouse warehouse);

    /**
     * 查询仓库列表
     * @param status
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<List<WarehouseListVo>> queryWarehouseList(Boolean status, Integer pageNum, Integer pageSize);

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
