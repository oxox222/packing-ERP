package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.model.FetchRecord;
import com.plz.modules.vo.AllFetchRecordQueryVo;
import com.plz.modules.vo.FetchRecordQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FetchRecordMapper extends BaseMapper<FetchRecord> {

    /**
     * 查询出库单列表
     * @param query
     * @return
     */
    Page<FetchRecord> list(@Param("query") FetchRecordQueryVo query, @Param("page") Page page);

    /**
     * 查询出库单列表(不分页)
     * @param query
     * @return
     */
    List<FetchRecord> getAllList(@Param("query") AllFetchRecordQueryVo query);

    /**
     * 修改出库单状态
     * @param id
     * @param state
     */
    void updateStatus(@Param("id") Integer id, @Param("state") Integer state);

    /**
     * 根据id查询出库单详情
     * @param fetchId
     * @return
     */
    FetchRecord getFetchRecordDetails(@Param("fetchId") Integer fetchId);
}