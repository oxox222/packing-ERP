package com.plz.modules.dao;

import com.plz.modules.model.FetchGoods;

public interface FetchGoodsMapper {
    int insert(FetchGoods record);

    int insertSelective(FetchGoods record);
}