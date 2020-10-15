package com.plz.modules.controller;

import com.plz.modules.model.Result;
import com.plz.modules.model.Supplier;
import com.plz.modules.service.SupplierService;
import com.plz.modules.vo.SupplierQueryVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: SupplierController
 * @Description: 供应商管理接口
 * @Author: PANLVZ
 * @Date: 2020/7/1
 */
@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Resource
    private SupplierService supplierService;

    /**
     * 新增供货商
     * @param supplier
     * @return
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Result insert(@RequestBody Supplier supplier) {
        Integer id = supplierService.insert(supplier);
        return Result.success(id);
    }

    /**
     * 查询供货商信息
     * @param query
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Result list(SupplierQueryVo query) {
        List<Supplier> result = supplierService.list(query);
        return Result.success(result);
    }

    /**
     * 编辑供应商信息
     * @param supplier
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Result update(@RequestBody Supplier supplier) {
        supplierService.update(supplier);
        return Result.success(null);
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") int id) {
        supplierService.delete(id);
        return Result.success(null);
    }

}
