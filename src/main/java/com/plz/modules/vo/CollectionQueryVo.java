package com.plz.modules.vo;

import com.plz.modules.entity.PageBase;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: CollectionQueryVo
 * @Description: 收款单查询条件
 * @Author: PANLVZ
 * @Date: 2022/1/2
 */
@Data
public class CollectionQueryVo extends PageBase {

    /**
     * 客户id(多选)
     */
    private List<Integer> customIds = new ArrayList<>();

    /**
     * 收货方id(多选)
     */
    private List<Integer> receiverIds = new ArrayList<>();

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;
}
