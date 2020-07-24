package com.plz.modules.mapper;

import com.plz.modules.model.FetchGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FetchGoodsMapper {
    int insert(FetchGoods record);

    int insertSelective(FetchGoods record);

    /**
     * 出库商品批量插入
     * @param list
     * @return
     */
    int insertBatch(@Param("list") List<FetchGoods> list);
}