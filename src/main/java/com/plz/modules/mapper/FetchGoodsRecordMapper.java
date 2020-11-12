package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.entity.FetchGoodsRecordDto;
import com.plz.modules.model.FetchGoodsRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FetchGoodsRecordMapper extends BaseMapper<FetchGoodsRecord> {

    /**
     * 批量插入
     * @param list
     */
    void insertOfBatch(@Param("list") List<FetchGoodsRecord> list);

    /**
     * 根据订单id删除商品记录
     * @param recordId
     */
    void deleteByRecordId(@Param("recordId") int recordId);

    /**
     * 根据订单号查询商品
     * @param recordId
     * @return
     */
    List<FetchGoodsRecordDto> selectByRecordId(@Param("recordId") Integer recordId);
}