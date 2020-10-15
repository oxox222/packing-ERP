package com.plz.modules.controller;

import com.plz.modules.model.Custom;
import com.plz.modules.model.Result;
import com.plz.modules.service.CustomService;
import com.plz.modules.vo.CustomQueryVo;
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
public class CustomController {

    @Resource
    private CustomService customService;

    /**
     * 新增客户
     * @param custom
     * @return
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Result addCustom(@RequestBody Custom custom) {
        Integer id = customService.addCustom(custom);
        return Result.success(id);
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
     * @param query
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Result queryList(CustomQueryVo query) {
        List<Custom> result = customService.queryCustom(query);
        return Result.success(result);
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable("id") int id) {
        customService.deleteById(id);
        return Result.success(null);
    }
}
