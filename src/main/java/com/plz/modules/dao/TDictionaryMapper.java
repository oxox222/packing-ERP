package com.plz.modules.dao;

import com.plz.modules.model.TDictionary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TDictionaryMapper {

    int insert(TDictionary record);

    int insertSelective(TDictionary record);

    /**
     * 根据类型查询字典
     * @param type
     * @return
     */
    List<TDictionary> selectByType(@Param("type") String type);
}