package com.plz.modules.controller;

import com.plz.modules.model.Custom;
import com.plz.modules.model.Result;
import com.plz.modules.service.CustomService;
import com.plz.modules.vo.CustomQueryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: CustomController
 * @Description: 客户管理接口
 * @Author: PANLVZ
 * @Date: 2020/7/3
 */
@RestController
@RequestMapping("/custom")
@Api(tags = "客户管理")
public class CustomController {

    @Resource
    private CustomService customService;


    /**
     * 新增客户
     * @param custom
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation("新增客户")
    public Result addCustom(@RequestBody Custom custom) {
        customService.addCustom(custom);
        return Result.success(null);
    }

    /**
     * 编辑客户信息
     * @param custom
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ApiOperation("编辑客户信息")
    public Result updateCustom(@RequestBody Custom custom) {
        customService.updateCustom(custom);
        return Result.success(null);
    }

    /**
     * 查询客户列表
     * @param query
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ApiOperation("查询客户列表")
    public Result queryList(CustomQueryVo query) {
        List<Custom> result = customService.queryCustom(query);
        return Result.success(result);
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ApiOperation("根据id删除")
    public Result deleteById(@PathVariable("id") int id) {
        customService.deleteById(id);
        return Result.success(null);
    }
}
