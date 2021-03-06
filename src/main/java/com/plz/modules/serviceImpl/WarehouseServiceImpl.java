package com.plz.modules.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.plz.modules.dao.*;
import com.plz.modules.model.StatusBaseQuery;
import com.plz.modules.model.Warehouse;
import com.plz.modules.service.WarehouseService;
import com.plz.modules.entity.WarehouseListDto;
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
    public PageInfo<List<WarehouseListDto>> queryWarehouseList(StatusBaseQuery statusBaseQuery) {
        PageHelper.startPage(statusBaseQuery.getPageNum(), statusBaseQuery.getPageSize());
        List<WarehouseListDto> list = warehouseMapper.selectList(statusBaseQuery.getStatus());
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

    @Override
    public Warehouse queryWarehouseDetails(int id) {
        return warehouseMapper.queryDetails(id);
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
