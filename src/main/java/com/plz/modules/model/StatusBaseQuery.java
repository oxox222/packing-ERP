package com.plz.modules.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName: StatusBaseQuery
 * @Description: 状态通用查询
 * @Author: PANLVZ
 * @Date: 2020/7/3
 */
@Getter
@Setter
@ToString
public class StatusBaseQuery extends PageBaseQuery {

    /**
     * 状态
     */
    private Boolean status = true;
}
