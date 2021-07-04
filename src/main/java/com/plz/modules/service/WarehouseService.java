package com.plz.modules.service;

import com.plz.modules.entity.RepertoryDto;
import com.plz.modules.model.Statistics;
import com.plz.modules.model.Warehouse;
import com.plz.modules.vo.WarehouseQueryVo;

import java.util.List;

public interface WarehouseService {

    /**
     * 新增仓库
     * @param warehouse
     * @return
     */
    Integer insert(Warehouse warehouse) throws Exception;

    /**
     * 查询仓库列表
     * @param query
     * @return
     */
    List<Warehouse> list(WarehouseQueryVo query);

    /**
     * 编辑仓库
     * @param warehouse
     */
    void update(Warehouse warehouse);

    /**
     * 根据id删除
     * @param id
     */
    void delete(int id);

    /**
     * 查询库存量
     * @param id
     * @return
     */
    List<RepertoryDto> getRepertory(Integer id);

    /**
     * 仓库统计
     * @return
     */
    List<Statistics> getStatistics();
}
