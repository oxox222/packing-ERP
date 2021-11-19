package com.plz.modules.controller;

import com.plz.modules.service.CancelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 退货管理接口
 * Created by PANLVZ on 2021/11/19
 */
@RestController
@RequestMapping("/cancel")
public class CancelController {

    @Resource
    private CancelService cancelService;

}
