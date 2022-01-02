package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.entity.CancelRecordDto;
import com.plz.modules.model.CancelRecord;
import com.plz.modules.vo.CancelQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by PANLVZ on 2021/11/19
 */
public interface CancelRecordMapper extends BaseMapper<CancelRecord> {

    /**
     * 分页查询
     * @param query
     * @param page
     * @return
     */
    Page<CancelRecordDto> queryByPage(@Param("query") CancelQueryVo query, @Param("page") Page page);

    /**
     * 查询(不分页)
     * @param query
     * @return
     */
    List<CancelRecordDto> queryByAll(@Param("query") CancelQueryVo query);


}
