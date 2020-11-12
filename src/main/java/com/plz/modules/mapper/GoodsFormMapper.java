package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.entity.FormGoodDto;
import com.plz.modules.entity.FormRepertoryDto;
import com.plz.modules.entity.GoodFormDto;
import com.plz.modules.model.GoodsForm;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsFormMapper extends BaseMapper<GoodsForm> {

    /**
     * 批量插入关联商品信息
     * @param list
     */
    void insertOfBatch(@Param("list") List<GoodsForm> list);

    /**
     * 根据源商品号删除关联信息
     * @param originGoodId
     */
    void deleteByOriginGoodId(@Param("originGoodId") int originGoodId);

    /**
     * 查询关联商品列表
     * @return
     */
    List<GoodFormDto> selectGoodFormList();

    /**
     * 查询库存信息集合
     * @return
     */
    List<FormRepertoryDto> repertoryByOriginGoodId(@Param("originGoodId") int originGoodId);

    /**
     * 查询子级关联商品集合
     * @param originGoodId
     * @return
     */
    List<FormGoodDto> selectByOriginGoodId(@Param("originGoodId") int originGoodId);

}
