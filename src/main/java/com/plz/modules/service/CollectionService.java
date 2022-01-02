package com.plz.modules.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.entity.CollectionRecordDto;
import com.plz.modules.model.CollectionRecord;
import com.plz.modules.vo.CollectionQueryVo;

import java.util.List;

public interface CollectionService {

    /**
     * 新增收款单
     * @param record
     */
    void add(CollectionRecord record);

    /**
     * 编辑收款单
     * @param record
     */
    void update(CollectionRecord record);

    /**
     * 删除收款单
     * @param id
     */
    void delete(Integer id);

    /**
     * 查询收款信息(分页)
     * @param query
     * @param page
     * @return
     */
    Page<CollectionRecordDto> queryByPage(CollectionQueryVo query, Page page);

    /**
     * 查询收款信息(不分页)
     * @param query
     * @return
     */
    List<CollectionRecordDto> queryByAll(CollectionQueryVo query);
}
