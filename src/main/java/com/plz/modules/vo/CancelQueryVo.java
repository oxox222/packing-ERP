package com.plz.modules.vo;

import com.plz.modules.entity.PageBase;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: CancelQueryVo
 * @Description: 退货单查询vo
 * @Author: PANLVZ
 * @Date: 2021/11/20
 */
@Data
public class CancelQueryVo extends PageBase {

    /**
     * 客户id(多选)
     */
    private List<Integer> customIds = new ArrayList<>();

    /**
     * 退货方id(多选)
     */
    private List<Integer> cancelPersonIds = new ArrayList<>();

    /**
     * 商品id(多选)
     */
    private List<Integer> goodsIds = new ArrayList<>();

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

}
