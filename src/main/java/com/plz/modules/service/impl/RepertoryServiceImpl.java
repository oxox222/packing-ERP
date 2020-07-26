package com.plz.modules.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.plz.modules.entity.FetchRecordListDto;
import com.plz.modules.entity.SaveRecordListDto;
import com.plz.modules.mapper.FetchGoodsMapper;
import com.plz.modules.mapper.FetchRecordMapper;
import com.plz.modules.mapper.SaveGoodsMapper;
import com.plz.modules.mapper.SaveRecordMapper;
import com.plz.modules.model.FetchGoods;
import com.plz.modules.model.FetchRecord;
import com.plz.modules.model.SaveGoods;
import com.plz.modules.model.SaveRecord;
import com.plz.modules.service.RepertoryService;
import com.plz.modules.vo.RecordQueryVoVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
    private SaveGoodsMapper saveGoodsMapper;

    @Resource
    private FetchRecordMapper fetchRecordMapper;

    @Resource
    private FetchGoodsMapper fetchGoodsMapper;

    @Override
    public void insertSaveRecord(SaveRecord saveRecord) {
        int recordId = saveRecordMapper.insert(saveRecord);
        List<SaveGoods> goods = saveRecord.getGoods();
        //设置订单号
        goods.stream().forEach(e -> {
            e.settRecordid(recordId);
        });
        saveGoodsMapper.insertBatch(goods);
    }

    @Override
    public void insertFetchRecord(FetchRecord fetchRecord) {
        int recordId = fetchRecordMapper.insert(fetchRecord);
        List<FetchGoods> goods = fetchRecord.getGoods();
        //设置订单号
        goods.stream().forEach(e -> {
            e.settRecordid(recordId);
        });
        fetchGoodsMapper.insertBatch(goods);
    }

    @Override
    public PageInfo<List<FetchRecordListDto>> getFetchRecordList(RecordQueryVoVo query) {
        PageHelper.startPage(query.getPageNum(), query.getPageSize());
        List<FetchRecordListDto> list = fetchRecordMapper.selectList(query);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

    @Override
    public PageInfo<List<SaveRecordListDto>> getSaveRecordList(RecordQueryVoVo query) {
        PageHelper.startPage(query.getPageNum(), query.getPageSize());
        List<SaveRecordListDto> list = saveRecordMapper.selectList(query);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

    @Override
    public FetchRecord fetchRecordDetails(int id) {
        return fetchRecordMapper.details(id);
    }

    @Override
    public SaveRecord saveRecordDetails(int id) {
        return saveRecordMapper.details(id);
    }
}
