package com.plz.modules.controller;

import com.github.pagehelper.PageInfo;
import com.plz.modules.model.PageBaseQuery;
import com.plz.modules.model.Pagination;
import com.plz.modules.model.Result;
import com.plz.modules.model.Supplier;
import com.plz.modules.service.SupplierService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: SupplierController
 * @Description: 供应商接口
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
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Result addSupplier(@RequestBody Supplier supplier) {
        supplierService.addSupplier(supplier);
        return Result.success(null);
    }

    /**
     * 查询供货商信息
     * @param pageBaseQuery
     * @return
     */
    @RequestMapping(value = "/queryList", method = RequestMethod.POST)
    public Result querySupplierList(@RequestBody PageBaseQuery pageBaseQuery) {
        PageInfo<List<Supplier>> result = supplierService.querySupplierList(pageBaseQuery.getPageNum(), pageBaseQuery.getPageSize());
        return Result.success(Pagination.of(result));
    }

    /**
     * 编辑供应商信息
     * @param supplier
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Result updateSupplier(@RequestBody Supplier supplier) {
        supplierService.updateSupplier(supplier);
        return Result.success(null);
    }

}
