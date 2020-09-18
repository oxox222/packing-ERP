package com.plz.modules.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.plz.modules.mapper.GoodsMapper;
import com.plz.modules.model.Goods;
import com.plz.modules.service.GoodsService;
import com.plz.modules.vo.BaseQueryVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: GoodsServiceImpl
 * @Description: 商品管理
 * @Author: PANLVZ
 * @Date: 2020/8/18
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public void insertGoods(Goods goods) {
        goodsMapper.insert(goods);
    }

    @Override
    public void updateGoods(Goods goods) {
        goodsMapper.updateById(goods);
    }

    @Override
    public PageInfo findGoodsList(BaseQueryVo query) {
        PageHelper.startPage(query.getPageNum(), query.getPageSize());
        List<Goods> list = goodsMapper.list(query);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }
}
