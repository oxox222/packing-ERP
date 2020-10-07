package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.model.SaveRecord;
import com.plz.modules.vo.SaveRecordQueryVo;
import org.apache.ibatis.annotations.Param;

public interface SaveRecordMapper extends BaseMapper<SaveRecord> {

    /**
     * 查询入库单列表
     * @return
     */
    Page<SaveRecord> list(@Param("query") SaveRecordQueryVo query, @Param("page") Page page);

}