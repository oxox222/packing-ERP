package com.plz.modules.service;

import com.github.pagehelper.PageInfo;
import com.plz.modules.model.Goods;
import com.plz.modules.vo.BaseQueryVo;

import java.util.List;

public interface GoodsService {

    /**
     * 新增商品
     * @param goods
     */
    void insertGoods(Goods goods);

    /**
     * 编辑商品
     * @param goods
     */
    void updateGoods(Goods goods);

    /**
     * 查询商品列表
     * @return
     */
    PageInfo findGoodsList(BaseQueryVo query);
}
