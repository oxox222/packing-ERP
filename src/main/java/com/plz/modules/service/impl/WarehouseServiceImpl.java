package com.plz.modules.service.impl;

import com.plz.modules.entity.RepertoryDto;
import com.plz.modules.mapper.RepertoryMapper;
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

    @Resource
    private RepertoryMapper repertoryMapper;


    @Override
    public Integer insert(Warehouse warehouse) {
        warehouseMapper.insert(warehouse);
        return warehouse.getId();
    }

    @Override
    public List<Warehouse> list(WarehouseQueryVo query) {
        List<Warehouse> list = warehouseMapper.list(query);
        return list;
    }

    @Override
    public void update(Warehouse warehouse) {
        warehouseMapper.updateById(warehouse);
    }

    @Override
    public void delete(int id) {
        warehouseMapper.deleteById(id);
    }

    @Override
    public List<RepertoryDto> getRepertory(Integer id) {
        List<RepertoryDto> list = repertoryMapper.getRepertory(id);
        return list;
    }
}
