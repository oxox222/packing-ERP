package com.plz.modules.impl;

import com.plz.modules.mapper.DictionaryMapper;
import com.plz.modules.model.Dictionary;
import com.plz.modules.service.DictionaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: DictionaryServiceImpl
 * @Description: 字段管理业务层
 * @Author: PANLVZ
 * @Date: 2020/6/30
 */
@Service
public class DictionaryServiceImpl implements DictionaryService {

    @Resource
    private DictionaryMapper dictionaryMapper;

    @Override
    public List<Dictionary> getDictionaryByType(String type) {
        List<Dictionary> list = dictionaryMapper.selectByType(type);
        return list;
    }

    @Override
    public List<Dictionary> getAllDictionary() {
        return dictionaryMapper.selectList(null);
    }
}
