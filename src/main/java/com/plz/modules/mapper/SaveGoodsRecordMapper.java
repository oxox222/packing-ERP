package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.entity.SaveGoodsRecordDto;
import com.plz.modules.model.SaveGoodsRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaveGoodsRecordMapper extends BaseMapper<SaveGoodsRecord> {

    /**
     * 批量插入
     * @param list
     */
    void insertOfBatch(@Param("list") List<SaveGoodsRecord> list);

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
    List<SaveGoodsRecordDto> selectByRecordId(@Param("recordId") Integer recordId);
}
