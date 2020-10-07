package com.plz.modules.service;

import com.plz.modules.model.Goods;
import com.plz.modules.vo.GoodsQueryVo;

import java.util.List;

public interface GoodsService {

    /**
     * 新增商品
     * @param goods
     */
    void insert(Goods goods);

    /**
     * 编辑商品
     * @param goods
     */
    void update(Goods goods);

    /**
     * 查询商品列表
     * @return
     */
    List<Goods> list(GoodsQueryVo query);

    /**
     * 删除商品
     * @param id
     */
    void delete(Integer id);
}
