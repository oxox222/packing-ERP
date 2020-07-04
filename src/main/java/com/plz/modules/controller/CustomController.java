package com.plz.modules.controller;

import com.github.pagehelper.PageInfo;
import com.plz.modules.model.Custom;
import com.plz.modules.model.Pagination;
import com.plz.modules.model.Result;
import com.plz.modules.model.StatusBaseQuery;
import com.plz.modules.service.CustomService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
public class CustomController {

    @Resource
    private CustomService customService;


    /**
     * 新增客户
     * @param custom
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Result addCustom(@RequestBody Custom custom) {
        customService.addCustom(custom);
        return Result.success(null);
    }

    /**
     * 编辑客户信息
     * @param custom
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Result updateCustom(@RequestBody Custom custom) {
        customService.updateCustom(custom);
        return Result.success(null);
    }

    /**
     * 查询客户列表
     * @param statusBaseQuery
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Result queryList(@RequestBody StatusBaseQuery statusBaseQuery) {
        PageInfo<List<Custom>> result = customService.queryCustom(statusBaseQuery);
        return Result.success(Pagination.of(result));
    }
}
