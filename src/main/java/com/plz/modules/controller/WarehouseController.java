package com.plz.modules.controller;

import com.github.pagehelper.PageInfo;
import com.plz.modules.model.Pagination;
import com.plz.modules.model.Warehouse;
import com.plz.modules.service.WarehouseService;
import com.plz.modules.vo.WarehouseListVo;
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
    @RequestMapping(value = "/addWarehouse", method = RequestMethod.POST)
    public void addWarehouse(@RequestBody Warehouse warehouse) {
        warehouseService.addWarehouse(warehouse);
    }

    /**
     * 查询仓库列表
     * @param status
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/queryWarehouseList", method = RequestMethod.POST)
    public Pagination queryWarehouseList(@RequestParam Boolean status,
                                         @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                         @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        PageInfo<List<WarehouseListVo>> result = warehouseService.queryWarehouseList(status, pageNum, pageSize);
        return Pagination.of(result);
    }

    /**
     * 查询仓库详细信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/queryWarehouseDetails/{id}", method = RequestMethod.GET)
    public Warehouse queryWarehouseDetails(@PathVariable("id") int id) {
        return warehouseService.queryWarehouseDetails(id);
    }

    /**
     * 编辑仓库信息
     * @param warehouse
     */
    @RequestMapping(value = "/updateWarehouse", method = RequestMethod.PUT)
    public void updateWarehouse(@RequestBody Warehouse warehouse) {
        warehouseService.updateWarehouse(warehouse);
    }
}
