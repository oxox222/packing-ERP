package com.plz.modules.impl;

import com.plz.modules.mapper.CancelGoodsRecordMapper;
import com.plz.modules.mapper.CancelRecordMapper;
import com.plz.modules.service.CancelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 退货模块
 * Created by PANLVZ on 2021/11/19
 */
@Service
public class CancelServiceImpl implements CancelService {

    @Resource
    private CancelRecordMapper cancelRecordMapper;

    @Resource
    private CancelGoodsRecordMapper cancelGoodsRecordMapper;
}


