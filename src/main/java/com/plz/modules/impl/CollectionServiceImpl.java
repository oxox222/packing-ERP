package com.plz.modules.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.entity.CollectionRecordDto;
import com.plz.modules.mapper.CollectionRecordMapper;
import com.plz.modules.model.CollectionRecord;
import com.plz.modules.service.CollectionService;
import com.plz.modules.vo.CollectionQueryVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: CollectionServiceImpl
 * @Description: 收款
 * @Author: PANLVZ
 * @Date: 2022/1/1
 */
@Service
public class CollectionServiceImpl implements CollectionService {

    @Resource
    private CollectionRecordMapper collectionRecordMapper;


    @Override
    public void add(CollectionRecord record) {
        collectionRecordMapper.insert(record);
    }

    @Override
    public void update(CollectionRecord record) {
        collectionRecordMapper.updateById(record);
    }

    @Override
    public void delete(Integer id) {
        collectionRecordMapper.deleteById(id);
    }

    @Override
    public Page<CollectionRecordDto> queryByPage(CollectionQueryVo query, Page page) {
        Page<CollectionRecordDto> pagInfo = collectionRecordMapper.queryByPage(query, page);
        return pagInfo;
    }

    @Override
    public List<CollectionRecordDto> queryByAll(CollectionQueryVo query) {
        List<CollectionRecordDto> list = collectionRecordMapper.queryByAll(query);
        return list;
    }
}
