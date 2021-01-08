package com.plz.modules.impl;

import com.plz.modules.mapper.CustomMapper;
import com.plz.modules.model.Custom;
import com.plz.modules.service.CustomService;
import com.plz.modules.vo.CustomQueryVo;
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
    public Integer addCustom(Custom custom) {
        customMapper.insert(custom);
        return custom.getId();
    }

    @Override
    public void updateCustom(Custom custom) {
        customMapper.updateById(custom);
    }

    @Override
    public List<Custom> queryCustom(CustomQueryVo query) {
        List<Custom> list = customMapper.queryList(query);
        return list;
    }

    @Override
    public void deleteById(int id) {
        customMapper.deleteById(id);
    }
}
