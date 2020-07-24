package com.plz.modules.service;

import com.github.pagehelper.PageInfo;
import com.plz.modules.model.Custom;
import com.plz.modules.vo.StatusBaseQueryVoVo;

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

    PageInfo<List<Custom>> queryCustom(StatusBaseQueryVoVo statusBaseQueryVo);

    /**
     * 根据id删除
     * @param id
     */
    void deleteById(int id);
}
