package com.plz.modules.service;

import com.plz.modules.model.TDictionary;

import java.util.List;

public interface DictionaryService {

    /**
     * 根据type获取字典
     * @param type
     * @return
     */
    List<TDictionary> getDictionaryByType(String type);

    /**
     * 获取所有字典
     * @return
     */
    List<TDictionary> getAllDictionary();
}
