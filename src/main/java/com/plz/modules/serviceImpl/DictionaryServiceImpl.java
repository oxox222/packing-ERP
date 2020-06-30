package com.plz.modules.serviceImpl;

import com.plz.modules.dao.TDictionaryMapper;
import com.plz.modules.model.TDictionary;
import com.plz.modules.service.DictionaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: DictionaryServiceImpl
 * @Description: TODO
 * @Author: PANLVZ
 * @Date: 2020/6/30
 */
@Service
public class DictionaryServiceImpl implements DictionaryService {

    @Resource
    private TDictionaryMapper tDictionaryMapper;

    @Override
    public List<TDictionary> getAllDictionary(String type) {
        List<TDictionary> list = tDictionaryMapper.selectByType(type);
        return list;
    }
}
