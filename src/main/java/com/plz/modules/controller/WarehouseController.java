package com.plz.modules.controller;

import com.plz.modules.entity.RepertoryDto;
import com.plz.modules.model.Result;
import com.plz.modules.model.Warehouse;
import com.plz.modules.service.WarehouseService;
import com.plz.modules.vo.RepertoryQueryVo;
import com.plz.modules.vo.WarehouseQueryVo;
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
    public Result insert(@RequestBody Warehouse warehouse) {
        warehouseService.insert(warehouse);
        return Result.success(null);
    }

    /**
     * 查询仓库列表
     * @param query
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Result list(WarehouseQueryVo query) {
        List<Warehouse> result = warehouseService.list(query);
        return Result.success(result);
    }

    /**
     * 编辑仓库信息
     * @param warehouse
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Result update(@RequestBody Warehouse warehouse) {
        warehouseService.update(warehouse);
        return Result.success(null);
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") int id) {
        warehouseService.delete(id);
        return Result.success(null);
    }

    @RequestMapping(value = "/repertory", method = RequestMethod.GET)
    public Result repertory(RepertoryQueryVo query) {
        List<RepertoryDto> list = warehouseService.getRepertory(query);
        return Result.success(list);
    }

}
