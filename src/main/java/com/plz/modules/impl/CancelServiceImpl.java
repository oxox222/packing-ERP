package com.plz.modules.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.mapper.CancelGoodsRecordMapper;
import com.plz.modules.mapper.CancelRecordMapper;
import com.plz.modules.model.CancelRecord;
import com.plz.modules.service.CancelService;
import com.plz.modules.vo.CancelQueryVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 退货模块
 * Created by PANLVZ on 2021/11/19
 */
@Service
public class CancelServiceImpl implements CancelService {

    @Resource
    private CancelRecordMapper cancelRecordMapper;

    @Resource
    private CancelGoodsRecordMapper cancelGoodsRecordMapper;

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void add(CancelRecord cancelRecord) {
        //退货单
        cancelRecordMapper.insert(cancelRecord);
        //退货商品
        if (cancelRecord.getCancelGoodsRecordList().size() > 0) {
            cancelRecord.getCancelGoodsRecordList().forEach(e -> e.setCancelId(cancelRecord.getId()));
            cancelGoodsRecordMapper.insertOfBatch(cancelRecord.getCancelGoodsRecordList());
        }
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void update(CancelRecord cancelRecord) {
        cancelRecordMapper.updateById(cancelRecord);
        //全删再全加
        cancelGoodsRecordMapper.deleteByCancelId(cancelRecord.getId());
        if (cancelRecord.getCancelGoodsRecordList().size() > 0) {
            cancelRecord.getCancelGoodsRecordList().forEach(e -> e.setCancelId(cancelRecord.getId()));
            cancelGoodsRecordMapper.insertOfBatch(cancelRecord.getCancelGoodsRecordList());
        }
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void delete(Integer id) {
        cancelGoodsRecordMapper.deleteByCancelId(id);
        cancelRecordMapper.deleteById(id);
    }

    @Override
    public Page<CancelRecord> queryByPage(CancelQueryVo query, Page page) {
        Page pageInfo = cancelRecordMapper.queryByPage(query, page);
        return pageInfo;
    }

    @Override
    public List<CancelRecord> queryByAll(CancelQueryVo query) {
        List<CancelRecord> list = cancelRecordMapper.queryByAll(query);
        return list;
    }

}


