package com.plz.modules.dao;

import com.plz.modules.entity.FetchRecordListDto;
import com.plz.modules.model.FetchRecord;
import com.plz.modules.vo.RecordQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FetchRecordMapper {

    int insert(FetchRecord record);

    int insertSelective(FetchRecord record);

    /**
     * 列表查询
     * @param query
     * @return
     */
    List<FetchRecordListDto> selectList(@Param("query") RecordQueryVo query);

    /**
     * 查询详情
     * @param id
     * @return
     */
    FetchRecord details(@Param("id") int id);
}