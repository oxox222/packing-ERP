package com.plz.modules.controller;

import com.plz.modules.model.Dictionary;
import com.plz.modules.model.Result;
import com.plz.modules.service.DictionaryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: DictionaryController
 * @Description: 数据字典接口
 * @Author: PANLVZ
 * @Date: 2020/6/30
 */
@RestController
@RequestMapping("/dictionary")
@Api(tags = "数据字典")
public class DictionaryController {

    @Resource
    private DictionaryService dictionaryService;

    /**
     * 根据type获取字典
     * @param type 字典类型
     * @return
     */
    @RequestMapping(value = "/{type}", method = RequestMethod.GET)
    @ApiOperation("根据type获取字典")
    public Result getDictionaryByType(@PathVariable(value = "type") String type) {
        List<Dictionary> list = dictionaryService.getDictionaryByType(type);
        return Result.success(list);
    }

    /**
     * 获取全部字典
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ApiOperation("获取全部字典")
    public Result getAllDictionary() {
        return Result.success(dictionaryService.getAllDictionary());
    }
}
