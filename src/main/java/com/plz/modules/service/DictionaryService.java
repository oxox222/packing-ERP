package com.plz.modules.service;

import com.plz.modules.model.Dictionary;

import java.util.List;

public interface DictionaryService {

    /**
     * 根据type获取字典
     * @param type
     * @return
     */
    List<Dictionary> getDictionaryByType(String type);

    /**
     * 获取所有字典
     * @return
     */
    List<Dictionary> getAllDictionary();
}
