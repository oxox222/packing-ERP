package com.plz.modules.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.model.Declaration;
import org.apache.ibatis.annotations.Param;

public interface DeclarationMapper extends BaseMapper<Declaration> {

    /**
     * 查询报单列表
     * @return
     */
    Page<Declaration> list(@Param("page") Page page);
}
