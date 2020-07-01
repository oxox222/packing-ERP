package com.plz.modules.dao;

import com.plz.modules.model.FetchRecord;

public interface FetchRecordMapper {
    int insert(FetchRecord record);

    int insertSelective(FetchRecord record);
}