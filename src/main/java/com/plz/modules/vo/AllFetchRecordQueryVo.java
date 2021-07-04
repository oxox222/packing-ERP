package com.plz.modules.vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: AllFetchRecordQueryVo
 * @Description: 出库单查询条件(不分页)
 * @Author: PANLVZ
 * @Date: 2021/7/4
 */
@Data
public class AllFetchRecordQueryVo {

    /**
     * 客户id（多选)
     */
    private List<Integer> customIds;

    /**
     * 收货方id（多选
     */
    private List<Integer> receiverIds;

    /**
     * 商品id（多选)
     */
    private List<Integer> goodsIds;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;
}
