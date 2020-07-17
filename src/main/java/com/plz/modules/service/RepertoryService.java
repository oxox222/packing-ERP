package com.plz.modules.service;

import com.github.pagehelper.PageInfo;
import com.plz.modules.entity.FetchRecordListDto;
import com.plz.modules.entity.SaveRecordListDto;
import com.plz.modules.model.FetchRecord;
import com.plz.modules.model.SaveRecord;
import com.plz.modules.vo.RecordQueryVo;

import java.util.List;

public interface RepertoryService {

    /**
     * 新增入库单
     * @param saveRecord
     */
    void insertSaveRecord(SaveRecord saveRecord);

    /**
     * 新增出库单
     * @param fetchRecord
     */
    void insertFetchRecord(FetchRecord fetchRecord);

    /**
     * 查询出库单列表
     * @param query
     * @return
     */
    PageInfo<List<FetchRecordListDto>> getFetchRecordList(RecordQueryVo query);

    /**
     * 查询入库单列表
     * @param query
     * @return
     */
    PageInfo<List<SaveRecordListDto>> getSaveRecordList(RecordQueryVo query);

    /**
     * 查询出库单详情
     * @param id 主键
     * @return
     */
    FetchRecord fetchRecordDetails(int id);

    /**
     * 查询入库单详情
     * @param id 主键
     * @return
     */
    SaveRecord saveRecordDetails(int id);
}
