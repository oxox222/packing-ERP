package com.plz.modules.vo;

import com.plz.modules.model.PageBaseQuery;
import lombok.Data;

/**
 * @ClassName: RecordQueryVo
 * @Description: 订单查询vo
 * @Author: PANLVZ
 * @Date: 2020/7/17
 */
@Data
public class RecordQueryVo extends PageBaseQuery {

    /**
     * 状态
     */
    private Integer state;
}
