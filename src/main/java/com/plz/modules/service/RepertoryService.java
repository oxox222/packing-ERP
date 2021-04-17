package com.plz.modules.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.model.FetchRecord;
import com.plz.modules.model.SaveRecord;
import com.plz.modules.vo.FetchRecordQueryVo;
import com.plz.modules.vo.SaveRecordQueryVo;

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
     * 新增出库单时自动填充入库单信息
     * @return
     */
    void insertFetchAndSaveRecord(FetchRecord fetchRecord);

    /**
     * 编辑入库单
     * @param saveRecord
     */
    void updateSaveRecord(SaveRecord saveRecord);

    /**
     * 编辑出库单时编辑入库单信息
     * @param fetchRecord
     */
    void updateFetchAndSaveRecord(FetchRecord fetchRecord);

    /**
     * 编辑出库单
     * @param fetchRecord
     */
    void updateFetchRecord(FetchRecord fetchRecord);

    /**
     * 查询入库单列表
     * @return
     */
    Page<SaveRecord> getSaveRecordList(SaveRecordQueryVo query, Page page);

    /**
     * 查询出库单列表
     * @return
     */
    Page<FetchRecord> getFetchRecordList(FetchRecordQueryVo query, Page page);

    /**
     * 删除入库单
     * @param id
     */
    void deleteSaveRecord(Integer id);

    /**
     * 删除出库单
     * @param id
     */
    void deleteFetchRecord(Integer id);

    /**
     * 删除出库单时删除入库单信息
     * @param id 出库单id
     */
    void deleteFetchAndSaveRecord(Integer id);

    /**
     * 发货
     * @param id
     */
    void deliver(Integer id);

    /**
     * 签收
     * @param id
     */
    void sign(Integer id);

}
