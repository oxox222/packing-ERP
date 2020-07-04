package com.plz.modules.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.plz.modules.dao.CustomMapper;
import com.plz.modules.model.Custom;
import com.plz.modules.model.StatusBaseQuery;
import com.plz.modules.service.CustomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: CustomServiceImpl
 * @Description: 客户管理业务
 * @Author: PANLVZ
 * @Date: 2020/7/3
 */
@Service
public class CustomServiceImpl implements CustomService {

    @Resource
    private CustomMapper customMapper;

    @Override
    public void addCustom(Custom custom) {
        customMapper.insertSelective(custom);
    }

    @Override
    public void updateCustom(Custom custom) {
        customMapper.updateById(custom);
    }

    @Override
    public PageInfo<List<Custom>> queryCustom(StatusBaseQuery statusBaseQuery) {
        PageHelper.startPage(statusBaseQuery.getPageNum(), statusBaseQuery.getPageSize());
        List<Custom> list = customMapper.queryList(statusBaseQuery.getStatus());
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }
}
