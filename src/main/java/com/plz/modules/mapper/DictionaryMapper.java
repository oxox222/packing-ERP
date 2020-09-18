package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.model.Dictionary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DictionaryMapper extends BaseMapper<Dictionary> {

    /**
     * 根据类型查询字典
     * @param type
     * @return
     */
    List<Dictionary> selectByType(@Param("type") String type);
}