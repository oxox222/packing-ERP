package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.entity.CollectionRecordDto;
import com.plz.modules.model.CollectionRecord;
import com.plz.modules.vo.CollectionQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollectionRecordMapper extends BaseMapper<CollectionRecord> {

    /**
     * 查询收款信息(分页)
     * @param query
     * @param page
     * @return
     */
    Page<CollectionRecordDto> queryByPage(@Param("query") CollectionQueryVo query, @Param("page") Page page);

    /**
     * 查询收款信息(不分页)
     * @param query
     * @return
     */
    List<CollectionRecordDto> queryByAll(@Param("query") CollectionQueryVo query);
}
