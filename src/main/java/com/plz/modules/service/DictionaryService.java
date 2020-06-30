package com.plz.modules.service;

import com.plz.modules.model.TDictionary;

import java.util.List;

public interface DictionaryService {

    List<TDictionary> getAllDictionary(String type);
}
