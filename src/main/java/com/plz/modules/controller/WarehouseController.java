package com.plz.modules.controller;

import com.github.pagehelper.PageInfo;
import com.plz.modules.entity.WarehouseListDto;
import com.plz.modules.model.Pagination;
import com.plz.modules.model.Result;
import com.plz.modules.model.StatusBaseQuery;
import com.plz.modules.model.Warehouse;
import com.plz.modules.service.WarehouseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: WarehouseController
 * @Description: 仓库管理接口
 * @Author: PANLVZ
 * @Date: 2020/6/30
 */
@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Resource
    private WarehouseService warehouseService;

    /**
     * 新增仓库
     * @param warehouse
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Result addWarehouse(@RequestBody Warehouse warehouse) {
        warehouseService.addWarehouse(warehouse);
        return Result.success(null);
    }

    /**
     * 查询仓库列表
     * @param statusBaseQuery
     * @return
     */
    @RequestMapping(value = "/queryList", method = RequestMethod.POST)
    public Result queryWarehouseList(@RequestBody StatusBaseQuery statusBaseQuery) {
        PageInfo<List<WarehouseListDto>> result = warehouseService.queryWarehouseList(statusBaseQuery);
        return Result.success(Pagination.of(result));
    }

    /**
     * 查询仓库详细信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
    public Result queryWarehouseDetails(@PathVariable("id") int id) {
        return Result.success(warehouseService.queryWarehouseDetails(id));
    }

    /**
     * 编辑仓库信息
     * @param warehouse
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Result updateWarehouse(@RequestBody Warehouse warehouse) {
        warehouseService.updateWarehouse(warehouse);
        return Result.success(null);
    }

}
