package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.model.CancelGoodsRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by PANLVZ on 2021/11/19
 */
public interface CancelGoodsRecordMapper extends BaseMapper<CancelGoodsRecord> {

    /**
     * 批量插入
     * @param list
     */
    void insertOfBatch(@Param("list") List<CancelGoodsRecord> list);

    /**
     * 根据退货单号删除退货商品
     * @param cancelId
     */
    void deleteByCancelId(@Param("cancelId") Integer cancelId);

    /**
     * 根据退货单号查询退货商品
     * @param cancelId
     * @return
     */
    List<CancelGoodsRecord> selectByCancelId(@Param("cancelId") Integer cancelId);
}
