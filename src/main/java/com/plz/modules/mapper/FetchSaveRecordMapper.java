package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.model.FetchSaveRecord;
import org.apache.ibatis.annotations.Param;

public interface FetchSaveRecordMapper extends BaseMapper<FetchSaveRecord> {

    /**
     * 通过出库单id查询入库单id
     * @param fetchId
     * @return
     */
    Integer selectSaveIdByFetchId(@Param("fetchId") Integer fetchId);

    /**
     * 通过出库单删除关联信息
     * @param fetchId
     */
    void deleteByFetchId(@Param("fetchId") Integer fetchId);
}
