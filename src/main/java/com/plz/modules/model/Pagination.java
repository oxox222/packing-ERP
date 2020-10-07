package com.plz.modules.model;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.entity.PageBase;
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
public class Pagination<T> extends PageBase implements Serializable {

    private static final long serialVersionUID = -5500682167471390525L;

    /**
     * 总记录数
     */
    private long total;

    /**
     * 结果集
     */
    private List<T> data = Collections.emptyList();

    public static <T> Pagination<T> of(Page page) {
        Pagination<T> pagination = new Pagination<>();
        if (Objects.nonNull(page)) {
            pagination.setPageNum(page.getCurrent());
            pagination.setPageSize(page.getSize());
            pagination.setData(page.getRecords());
            pagination.setTotal(page.getTotal());
        }

        return pagination;
    }
}
