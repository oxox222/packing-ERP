package com.plz.modules.service.impl;

import com.plz.modules.mapper.GoodsMapper;
import com.plz.modules.model.Goods;
import com.plz.modules.service.GoodsService;
import com.plz.modules.vo.GoodsQueryVo;
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
    public Integer insert(Goods goods) {
        goodsMapper.insert(goods);
        return goods.getId();
    }

    @Override
    public void update(Goods goods) {
        goodsMapper.updateById(goods);
    }

    @Override
    public List<Goods> list(GoodsQueryVo query) {
        List<Goods> list = goodsMapper.list(query);
        return list;
    }

    @Override
    public void delete(Integer id) {
        goodsMapper.deleteById(id);
    }
}
