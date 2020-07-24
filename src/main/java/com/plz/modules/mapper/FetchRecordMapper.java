package com.plz.modules.mapper;

import com.plz.modules.entity.FetchRecordListDto;
import com.plz.modules.model.FetchRecord;
import com.plz.modules.vo.RecordQueryVoVo;
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
    List<FetchRecordListDto> selectList(@Param("query") RecordQueryVoVo query);

    /**
     * 查询详情
     * @param id
     * @return
     */
    FetchRecord details(@Param("id") int id);
}