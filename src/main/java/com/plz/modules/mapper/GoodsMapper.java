package com.plz.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plz.modules.model.Goods;
import com.plz.modules.vo.GoodsQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper extends BaseMapper<Goods> {

    /**
     * 查询商品列表
     * @return
     */
    List<Goods> list(@Param("query") GoodsQueryVo querye);

    /**
     * 判断是否存在
     * @param goods
     * @return
     */
    Integer ifRepetition(@Param("goods") Goods goods);
}
