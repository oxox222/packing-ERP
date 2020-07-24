package com.plz.modules.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.plz.modules.mapper.CustomMapper;
import com.plz.modules.model.Custom;
import com.plz.modules.vo.StatusBaseQueryVoVo;
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
    public PageInfo<List<Custom>> queryCustom(StatusBaseQueryVoVo statusBaseQueryVo) {
        PageHelper.startPage(statusBaseQueryVo.getPageNum(), statusBaseQueryVo.getPageSize());
        List<Custom> list = customMapper.queryList(statusBaseQueryVo.getStatus());
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

    @Override
    public void deleteById(int id) {
        customMapper.deleteById(id);
    }
}
