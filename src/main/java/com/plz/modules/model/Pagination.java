package com.plz.modules.model;

import com.github.pagehelper.PageInfo;
import com.plz.modules.vo.PageBaseQueryVo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @ClassName: Pagenation
 * @Description: 分页实体
 * @Author: PANLVZ
 * @Date: 2020/7/1
 */
@Getter
@Setter
@NoArgsConstructor
public class Pagination<T> extends PageBaseQueryVo implements Serializable {

    private static final long serialVersionUID = -5500682167471390525L;

    /**
     * 总记录数
     */
    private long total;

    /**
     * 结果集
     */
    private List<T> data = Collections.emptyList();

    public static <T> Pagination<T> of(PageInfo<T> pageInfo) {
        Pagination<T> pagination = new Pagination<>();
        if (Objects.nonNull(pageInfo)) {
            pagination.setPageNum(pageInfo.getPageNum());
            pagination.setPageSize(pageInfo.getPageSize());
            pagination.setData(pageInfo.getList());
            pagination.setTotal(pageInfo.getTotal());
        }

        return pagination;
    }
}
