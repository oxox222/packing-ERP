package com.plz.modules.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.mapper.DeclarationGoodsMapper;
import com.plz.modules.mapper.DeclarationMapper;
import com.plz.modules.model.Declaration;
import com.plz.modules.service.DeclarationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @ClassName: DeclarationServiceImpl
 * @Description: 报单模块
 * @Author: PANLVZ
 * @Date: 2021/5/3
 */
@Service
public class DeclarationServiceImpl implements DeclarationService {

    @Resource
    private DeclarationMapper declarationMapper;

    @Resource
    private DeclarationGoodsMapper declarationGoodsMapper;

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void insertDeclaration(Declaration declaration) {
        declarationMapper.insert(declaration);
        if (!declaration.getDeclarationGoodsList().isEmpty()) {
            declaration.getDeclarationGoodsList().stream().forEach(e -> {
                e.setDeclarationId(declaration.getId());
            });
            declarationGoodsMapper.insertOfBatch(declaration.getDeclarationGoodsList());
        }
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void updateDeclaration(Declaration declaration) {
        declarationMapper.updateById(declaration);
        //全删再全加
        declarationGoodsMapper.deleteByDeclarationId(declaration.getId());
        if (!declaration.getDeclarationGoodsList().isEmpty()) {
            declaration.getDeclarationGoodsList().stream().forEach(e -> {
                e.setDeclarationId(declaration.getId());
            });
            declarationGoodsMapper.insertOfBatch(declaration.getDeclarationGoodsList());
        }
    }

    @Override
    public void deleteDeclaration(Integer id) {
        declarationGoodsMapper.deleteByDeclarationId(id);
        declarationMapper.deleteById(id);
    }

    @Override
    public Page<Declaration> getDeclarationList(Page page) {
        Page<Declaration> pageInfo = declarationMapper.list(page);
        return pageInfo;
    }
}
