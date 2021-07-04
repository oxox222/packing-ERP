package com.plz.modules.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.mapper.*;
import com.plz.modules.model.FetchRecord;
import com.plz.modules.model.FetchSaveRecord;
import com.plz.modules.model.SaveGoodsRecord;
import com.plz.modules.model.SaveRecord;
import com.plz.modules.service.RepertoryService;
import com.plz.modules.util.OddUtils;
import com.plz.modules.vo.AllFetchRecordQueryVo;
import com.plz.modules.vo.FetchRecordQueryVo;
import com.plz.modules.vo.SaveRecordQueryVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    @Resource
    private OddUtils oddUtils;

    @Resource
    private FetchSaveRecordMapper fetchSaveRecordMapper;

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void insertSaveRecord(SaveRecord saveRecord) {
        if (Objects.isNull(saveRecord.getOdd()) || saveRecord.getOdd().isEmpty()) {
            saveRecord.setOdd(oddUtils.getOdd());
        }
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
        if (Objects.isNull(fetchRecord.getOdd()) || fetchRecord.getOdd().isEmpty()) {
            fetchRecord.setOdd(oddUtils.getOdd());
        }
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
    public void insertFetchAndSaveRecord(FetchRecord fetchRecord) {
        SaveRecord saveRecord = getSaveRecordByFetchRecord(fetchRecord);
        insertSaveRecord(saveRecord);
        insertFetchRecord(fetchRecord);
        //新增关联信息
        FetchSaveRecord fetchSaveRecord = new FetchSaveRecord();
        fetchSaveRecord.setSaveId(saveRecord.getId());
        fetchSaveRecord.setFetchId(fetchRecord.getId());
        fetchSaveRecordMapper.insert(fetchSaveRecord);
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void updateSaveRecord(SaveRecord saveRecord) {
        saveRecordMapper.updateById(saveRecord);
        //全删再全加
        saveGoodsRecordMapper.deleteByRecordId(saveRecord.getId());
        if (!saveRecord.getSaveGoodsRecordList().isEmpty()) {
            saveRecord.getSaveGoodsRecordList().stream().forEach(e -> {
                e.setRecordId(saveRecord.getId());
            });
            saveGoodsRecordMapper.insertOfBatch(saveRecord.getSaveGoodsRecordList());
        }
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void updateFetchRecord(FetchRecord fetchRecord) {
        fetchRecordMapper.updateById(fetchRecord);
        //全删再全加
        fetchGoodsRecordMapper.deleteByRecordId(fetchRecord.getId());
        if (!fetchRecord.getFetchGoodsRecordList().isEmpty()) {
            fetchRecord.getFetchGoodsRecordList().stream().forEach(e -> {
                e.setRecordId(fetchRecord.getId());
            });
            fetchGoodsRecordMapper.insertOfBatch(fetchRecord.getFetchGoodsRecordList());
        }
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void updateFetchAndSaveRecord(FetchRecord fetchRecord) {
        SaveRecord saveRecord = getSaveRecordByFetchRecord(fetchRecord);
        saveRecord.setId(fetchSaveRecordMapper.selectSaveIdByFetchId(fetchRecord.getId()));
        updateFetchRecord(fetchRecord);
        updateSaveRecord(saveRecord);
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
    public List<FetchRecord> getAllFetchRecordList(AllFetchRecordQueryVo query) {
        return fetchRecordMapper.getAllList(query);
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
        fetchSaveRecordMapper.deleteByFetchId(id);
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void deleteFetchAndSaveRecord(Integer id) {
        Integer saveRecordId = fetchSaveRecordMapper.selectSaveIdByFetchId(id);
        deleteSaveRecord(saveRecordId);
        deleteFetchRecord(id);

    }

    @Override
    public void deliver(Integer id) {
        fetchRecordMapper.deliver(id);
    }

    @Override
    public void sign(Integer id) {
        fetchRecordMapper.sign(id);
    }

    @Override
    public void invalid(Integer id) {

    }

    /**
     * 通过出库单信息填充入库单信息
     * @param fetchRecord
     * @return
     */
    private SaveRecord getSaveRecordByFetchRecord(FetchRecord fetchRecord) {
        SaveRecord saveRecord = SaveRecord.of(fetchRecord);
        List<SaveGoodsRecord> list = new ArrayList<>();
        Optional.ofNullable(fetchRecord.getFetchGoodsRecordList())
                .orElse(new ArrayList<>()).stream().forEach(e -> {
                    SaveGoodsRecord goodsRecord = new SaveGoodsRecord();
                    BeanUtils.copyProperties(e, goodsRecord, new String[]{"id", "odd"});
                    list.add(goodsRecord);
        });
        saveRecord.setSaveGoodsRecordList(list);
        return saveRecord;
    }
}
