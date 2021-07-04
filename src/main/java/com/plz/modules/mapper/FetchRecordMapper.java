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
     * 查询出库单列表
     * @param query
     * @return
     */
    List<FetchRecord> getAllList(@Param("query") AllFetchRecordQueryVo query);

    /**
     * 发货
     * @param id
     */
    void deliver(@Param("id") int id);

    /**
     * 签收
     * @param id
     */
    void sign(@Param("id") int id);

    /**
     * 取消订单
     * @param id
     */
    void invalid(@Param("id") int id);
}