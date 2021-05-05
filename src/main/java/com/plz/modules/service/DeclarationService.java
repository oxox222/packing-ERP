package com.plz.modules.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.model.Declaration;

public interface DeclarationService {

    /**
     * 新增报单
     * @param declaration
     */
    void insertDeclaration(Declaration declaration);

    /**
     * 编辑报单
     * @param declaration
     */
    void updateDeclaration(Declaration declaration);

    /**
     * 删除报单
     * @param id
     */
    void deleteDeclaration(Integer id);

    /**
     * 查询报单列表
     * @param page
     * @return
     */
    Page<Declaration> getDeclarationList(Page page);
}
