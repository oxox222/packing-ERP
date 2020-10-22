package com.plz.modules.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.mapper.FetchGoodsRecordMapper;
import com.plz.modules.mapper.FetchRecordMapper;
import com.plz.modules.mapper.SaveGoodsRecordMapper;
import com.plz.modules.mapper.SaveRecordMapper;
import com.plz.modules.model.FetchRecord;
import com.plz.modules.model.SaveRecord;
import com.plz.modules.service.RepertoryService;
import com.plz.modules.vo.FetchRecordQueryVo;
import com.plz.modules.vo.SaveRecordQueryVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @ClassName: RepertoryServiceImpl
 * @Description: 库存管理业务
 * @Author: PANLVZ
 * @Date: 2020/7/4
 */
@Service
public class RepertoryServiceImpl implements RepertoryService {

    @Resource
    private SaveRecordMapper saveRecordMapper;

    @Resource
    private FetchRecordMapper fetchRecordMapper;

    @Resource
    private SaveGoodsRecordMapper saveGoodsRecordMapper;

    @Resource
    private FetchGoodsRecordMapper fetchGoodsRecordMapper;

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void insertSaveRecord(SaveRecord saveRecord) {
        saveRecordMapper.insert(saveRecord);
        //设置商品订单号
        if (!saveRecord.getSaveGoodsRecordList().isEmpty()) {
            saveRecord.getSaveGoodsRecordList().stream().forEach(e -> {
                e.setRecordId(saveRecord.getId());
            });
            saveGoodsRecordMapper.insertOfBatch(saveRecord.getSaveGoodsRecordList());
        }
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void insertFetchRecord(FetchRecord fetchRecord) {
        fetchRecordMapper.insert(fetchRecord);
        //设置商品订单号
        if (!fetchRecord.getFetchGoodsRecordList().isEmpty()) {
            fetchRecord.getFetchGoodsRecordList().stream().forEach(e -> {
                e.setRecordId(fetchRecord.getId());
            });
            fetchGoodsRecordMapper.insertOfBatch(fetchRecord.getFetchGoodsRecordList());
        }
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void updateSaveRecord(SaveRecord saveRecord) {
        saveRecordMapper.updateById(saveRecord);
        //全删再全加
        saveGoodsRecordMapper.deleteByRecordId(saveRecord.getId());
        saveRecord.getSaveGoodsRecordList().stream().forEach(e -> {
            e.setRecordId(saveRecord.getId());
        });
        saveGoodsRecordMapper.insertOfBatch(saveRecord.getSaveGoodsRecordList());
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void updateFetchRecord(FetchRecord fetchRecord) {
        fetchRecordMapper.updateById(fetchRecord);
        if (!fetchRecord.getFetchGoodsRecordList().isEmpty()) {
            //全删再全加
            fetchGoodsRecordMapper.deleteByRecordId(fetchRecord.getId());
            fetchRecord.getFetchGoodsRecordList().stream().forEach(e -> {
                e.setRecordId(fetchRecord.getId());
            });
            fetchGoodsRecordMapper.insertOfBatch(fetchRecord.getFetchGoodsRecordList());
        }
    }

    @Override
    public Page<SaveRecord> getSaveRecordList(SaveRecordQueryVo query, Page page) {
        Page<SaveRecord> pageInfo = saveRecordMapper.list(query, page);
        return pageInfo;
    }

    @Override
    public Page<FetchRecord> getFetchRecordList(FetchRecordQueryVo query, Page page) {
        Page<FetchRecord> pageInfo = fetchRecordMapper.list(query, page);
        return pageInfo;
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void deleteSaveRecord(Integer id) {
        //删除关联商品
        saveGoodsRecordMapper.deleteByRecordId(id);
        //删除入库单
        saveRecordMapper.deleteById(id);
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void deleteFetchRecord(Integer id) {
        //删除关联商品
        fetchGoodsRecordMapper.deleteByRecordId(id);
        //删除入库单
        fetchRecordMapper.deleteById(id);
    }

    @Override
    public void deliver(Integer id) {
        fetchRecordMapper.deliver(id);
    }

    @Override
    public void sign(Integer id) {
        fetchRecordMapper.sign(id);
    }
}
