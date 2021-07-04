package com.plz.modules.impl;

import com.plz.modules.entity.RepertoryDto;
import com.plz.modules.mapper.RepertoryMapper;
import com.plz.modules.mapper.StatisticsMapper;
import com.plz.modules.mapper.WarehouseMapper;
import com.plz.modules.model.Statistics;
import com.plz.modules.model.Warehouse;
import com.plz.modules.service.WarehouseService;
import com.plz.modules.vo.WarehouseQueryVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

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

    @Resource
    private StatisticsMapper statisticsMapper;


    @Override
    public Integer insert(Warehouse warehouse) throws Exception {
        if (ifRepetition(warehouse.getName())) {
            throw new Exception("该仓库已存在!");
        }
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

    @Override
    public List<Statistics> getStatistics() {
        List<Statistics> list = statisticsMapper.list();
        return list;
    }

    /**
     * 判断是否存在重复
     * @param name
     * @return
     */
    private Boolean ifRepetition(String name) {
        return Objects.nonNull(warehouseMapper.ifRepetition(name));
    }
}
