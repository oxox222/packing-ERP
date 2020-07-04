package com.plz.modules.controller;

import com.plz.modules.model.Result;
import com.plz.modules.service.DictionaryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: DictionaryController
 * @Description: 数据字典接口
 * @Author: PANLVZ
 * @Date: 2020/6/30
 */
@RestController
@RequestMapping("/dictionary")
public class DictionaryController {

    @Resource
    private DictionaryService dictionaryService;

    @RequestMapping(value = "/getAllDictionary", method = RequestMethod.GET)
    public Result getAllDictionary(@RequestParam String type) {
        return Result.success(dictionaryService.getAllDictionary(type));
    }
}
