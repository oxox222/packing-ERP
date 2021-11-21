package com.plz.modules.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.model.CancelRecord;
import com.plz.modules.vo.CancelQueryVo;

import java.util.List;

/**
 * Created by PANLVZ on 2021/11/19
 */
public interface CancelService {

    /**
     * 新增退货单
     * @param cancelRecord
     */
    void add(CancelRecord cancelRecord);

    /**
     * 修改退货单
     * @param cancelRecord
     */
    void update(CancelRecord cancelRecord);

    /**
     * 删除出库单
     * @param id
     */
    void delete(Integer id);

    /**
     * 退货单分页查询
     * @param query
     * @param page
     * @return
     */
    Page<CancelRecord> queryByPage(CancelQueryVo query, Page page);

    /**
     * 退货单查询(不分页)
     * @param query
     * @return
     */
    List<CancelRecord> queryByAll(CancelQueryVo query);

}
