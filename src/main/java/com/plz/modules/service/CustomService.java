package com.plz.modules.service;

import com.plz.modules.model.Custom;
import com.plz.modules.vo.CustomQueryVo;

import java.util.List;

public interface CustomService {

    /**
     * 新增客户
     * @param custom
     * @return
     */
    Integer addCustom(Custom custom) throws Exception;

    /**
     * 编辑客户信息
     * @param custom
     */
    void updateCustom(Custom custom);

    /**
     * 查询客户列表
     * @param query
     * @return
     */
    List<Custom> queryCustom(CustomQueryVo query);

    /**
     * 根据id删除
     * @param id
     */
    void deleteById(int id);

    /**
     * 查询客户详情
     * @param id
     * @return
     */
    Custom details(int id);
}
