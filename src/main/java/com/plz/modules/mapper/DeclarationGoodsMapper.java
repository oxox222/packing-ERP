package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.model.DeclarationGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeclarationGoodsMapper extends BaseMapper<DeclarationGoods> {

    /**
     * 批量插入
     * @param list
     */
    void insertOfBatch(@Param("list") List<DeclarationGoods> list);

    /**
     * 根据报单号删除商品
     * @param declarationId
     */
    void deleteByDeclarationId(@Param("declarationId") Integer declarationId);

    /**
     * 根据报单号查询商品
     * @param declarationId
     * @return
     */
    List<DeclarationGoods> selectByDeclarationId(@Param("declarationId") Integer declarationId);
}
