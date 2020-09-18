package com.plz.modules.service;

import com.plz.modules.model.Custom;
import com.plz.modules.vo.CustomQueryVo;

import java.util.List;

public interface CustomService {

    /**
     * 新增客户
     * @param custom
     */
    void addCustom(Custom custom);

    /**
     * 编辑客户信息
     * @param custom
     */
    void updateCustom(Custom custom);

    List<Custom> queryCustom(CustomQueryVo query);

    /**
     * 根据id删除
     * @param id
     */
    void deleteById(int id);
}
