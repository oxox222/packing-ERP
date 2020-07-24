package com.plz.modules.mapper;

import com.plz.modules.entity.SaveRecordListDto;
import com.plz.modules.model.SaveRecord;
import com.plz.modules.vo.RecordQueryVoVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaveRecordMapper {

    int insert(SaveRecord record);

    int insertSelective(SaveRecord record);

    /**
     * 列表查询
     * @param query
     * @return
     */
    List<SaveRecordListDto> selectList(@Param("query") RecordQueryVoVo query);

    /**
     * 查询详情
     * @param id
     * @return
     */
    SaveRecord details(@Param("id") int id);
}