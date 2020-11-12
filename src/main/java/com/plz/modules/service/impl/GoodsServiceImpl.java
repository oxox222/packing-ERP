package com.plz.modules.service.impl;

import com.plz.modules.entity.GoodFormDto;
import com.plz.modules.mapper.GoodsFormMapper;
import com.plz.modules.mapper.GoodsMapper;
import com.plz.modules.model.Goods;
import com.plz.modules.service.GoodsService;
import com.plz.modules.vo.GoodsQueryVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

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

    @Resource
    private GoodsFormMapper goodsFormMapper;


    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public Integer insert(Goods goods) {
        goodsMapper.insert(goods);
        if (Objects.nonNull(goods.getGoodsFormList()) && !goods.getGoodsFormList().isEmpty()) {
            insertGoodsForm(goods);
        }
        return goods.getId();
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void update(Goods goods) {
        goodsMapper.updateById(goods);
        if (Objects.nonNull(goods.getGoodsFormList()) && !goods.getGoodsFormList().isEmpty()) {
            goodsFormMapper.deleteByOriginGoodId(goods.getId());
            insertGoodsForm(goods);
        }
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

    @Override
    public List<GoodFormDto> goodFormList() {
        List<GoodFormDto> list = goodsFormMapper.selectGoodFormList();
        return list;
    }

    /**
     * 新增关联商品信息
     * @param goods
     */
    private void insertGoodsForm(Goods goods) {
        //设置关联商品
        goods.getGoodsFormList().stream().forEach(e -> {
            e.setOriginGoodId(goods.getId());
        });
        goodsFormMapper.insertOfBatch(goods.getGoodsFormList());
    }
}
