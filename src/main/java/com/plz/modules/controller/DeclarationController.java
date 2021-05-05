package com.plz.modules.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.entity.PageBase;
import com.plz.modules.model.Declaration;
import com.plz.modules.model.Pagination;
import com.plz.modules.model.Result;
import com.plz.modules.service.DeclarationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName: DeclarationController
 * @Description: 报单接口
 * @Author: PANLVZ
 * @Date: 2021/5/3
 */
@RestController
@RequestMapping("/declaration")
public class DeclarationController {

    @Resource
    private DeclarationService declarationService;

    /**
     * 新增报单
     * @param declaration
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public Result insertSaveRecord(@RequestBody Declaration declaration) {
        declarationService.insertDeclaration(declaration);
        return Result.success(null);
    }

    /**
     * 编辑出库单
     * @param declaration
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    public Result updateDeclaration(@RequestBody Declaration declaration) {
        declarationService.updateDeclaration(declaration);
        return Result.success(null);
    }

    /**
     * 删除报单
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result deleteDeclaration(@PathVariable("id") Integer id) {
        declarationService.deleteDeclaration(id);
        return Result.success(null);
    }

    /**
     * 查询报单列表
     * @param query
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result declarationList(PageBase query) {
        Page<Declaration> pageInfo = declarationService
                .getDeclarationList(new Page(query.getPageNum(), query.getPageSize()));
        return Result.success(Pagination.of(pageInfo));
    }
}
