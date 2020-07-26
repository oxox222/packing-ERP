package com.plz.modules.controller;

import com.github.pagehelper.PageInfo;
import com.plz.modules.entity.WarehouseListDto;
import com.plz.modules.model.Pagination;
import com.plz.modules.model.Result;
import com.plz.modules.vo.StatusBaseQueryVo;
import com.plz.modules.model.Warehouse;
import com.plz.modules.service.WarehouseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "仓库管理")
public class WarehouseController {

    @Resource
    private WarehouseService warehouseService;

    /**
     * 新增仓库
     * @param warehouse
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation("新增仓库")
    public Result addWarehouse(@RequestBody Warehouse warehouse) {
        warehouseService.addWarehouse(warehouse);
        return Result.success(null);
    }

    /**
     * 查询仓库列表
     * @param statusBaseQueryVo
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ApiOperation("查询仓库列表")
    public Result queryWarehouseList(StatusBaseQueryVo statusBaseQueryVo) {
        PageInfo<List<WarehouseListDto>> result = warehouseService.queryWarehouseList(statusBaseQueryVo);
        return Result.success(Pagination.of(result));
    }

    /**
     * 查询仓库详细信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
    @ApiOperation("查询仓库详细信息")
    public Result queryWarehouseDetails(@PathVariable("id") int id) {
        return Result.success(warehouseService.queryWarehouseDetails(id));
    }

    /**
     * 编辑仓库信息
     * @param warehouse
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ApiOperation("编辑仓库信息")
    public Result updateWarehouse(@RequestBody Warehouse warehouse) {
        warehouseService.updateWarehouse(warehouse);
        return Result.success(null);
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ApiOperation("根据id删除")
    public Result deleteById(@PathVariable("id") int id) {
        warehouseService.deleteById(id);
        return Result.success(null);
    }

}
