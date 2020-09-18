package com.plz.modules.service.impl;

import com.plz.modules.mapper.WarehouseMapper;
import com.plz.modules.model.Warehouse;
import com.plz.modules.service.WarehouseService;
import com.plz.modules.vo.WarehouseQueryVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: WarehouseServiceImpl
 * @Description: 仓库管理业务层
 * @Author: PANLVZ
 * @Date: 2020/6/30
 */
@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Resource
    private WarehouseMapper warehouseMapper;


    @Override
    public void addWarehouse(Warehouse warehouse) {
        warehouseMapper.insert(warehouse);
    }

    @Override
    public List<Warehouse> queryWarehouseList(WarehouseQueryVo query) {
        List<Warehouse> list = warehouseMapper.list(query);
        return list;
    }

    @Override
    public void updateWarehouse(Warehouse warehouse) {
        warehouseMapper.updateById(warehouse);
    }

    @Override
    public void deleteById(int id) {
        warehouseMapper.deleteById(id);
    }
}
