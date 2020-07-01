package com.plz.modules.dao;

import com.plz.modules.model.SaveRecord;

public interface SaveRecordMapper {
    int insert(SaveRecord record);

    int insertSelective(SaveRecord record);
}