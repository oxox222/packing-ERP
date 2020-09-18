package com.plz.modules.mapper;

import com.plz.modules.model.FetchGoodsRecord;

public interface FetchGoodsRecordMapper {
    int insert(FetchGoodsRecord record);

    int insertSelective(FetchGoodsRecord record);
}