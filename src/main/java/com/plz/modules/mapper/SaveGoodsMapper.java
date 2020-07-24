package com.plz.modules.mapper;

import com.plz.modules.model.SaveGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaveGoodsMapper {
    int insert(SaveGoods record);

    int insertSelective(SaveGoods record);

    /**
     * 批量插入库存商品信息
     * @param list
     * @return
     */
    int insertBatch(@Param("list") List<SaveGoods> list);


    List<SaveGoods> selectById(@Param("recordId") int recordId);
}