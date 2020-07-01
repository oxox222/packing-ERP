package com.plz.modules.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.plz.modules.dao.*;
import com.plz.modules.model.Warehouse;
import com.plz.modules.service.WarehouseService;
import com.plz.modules.vo.WarehouseListVo;
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
    private SaveRecordMapper saveRecordMapper;

    @Resource
    private SaveGoodsMapper saveGoodsMapper;

    @Resource
    private FetchRecordMapper fetchRecordMapper;

    @Resource
    private FetchGoodsMapper fetchGoodsMapper;

    @Resource
    private WarehouseMapper warehouseMapper;

    @Override
    public void addWarehouse(Warehouse warehouse) {
        warehouseMapper.insert(warehouse);
    }

    @Override
    public PageInfo<List<WarehouseListVo>> queryWarehouseList(Boolean status, Integer pageNum, Integer pageSiz) {
        PageHelper.startPage(pageNum, pageSiz);
        List<WarehouseListVo> list = warehouseMapper.selectList();
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
}
