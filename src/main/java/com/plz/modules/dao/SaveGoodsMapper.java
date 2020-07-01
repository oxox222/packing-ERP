package com.plz.modules.dao;

import com.plz.modules.model.SaveGoods;

public interface SaveGoodsMapper {
    int insert(SaveGoods record);

    int insertSelective(SaveGoods record);
}