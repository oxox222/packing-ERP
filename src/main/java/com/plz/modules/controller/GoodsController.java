package com.plz.modules.controller;

import com.github.pagehelper.PageInfo;
import com.plz.modules.model.Goods;
import com.plz.modules.model.Pagination;
import com.plz.modules.model.Result;
import com.plz.modules.service.GoodsService;
import com.plz.modules.vo.BaseQueryVo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: GoodsController
 * @Description: 商品管理接口
 * @Author: PANLVZ
 * @Date: 2020/8/18
 */
@RestController
@RequestMapping("/goods")
@Api(tags = "商品管理")
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    /**
     * 新增商品
     * @param goods
     * @return
     */
    @RequestMapping(value = "/goods", method = RequestMethod.POST)
    public Result insertGoods(@RequestBody Goods goods) {
        goodsService.insertGoods(goods);
        return Result.success(null);
    }

    /**
     * 编辑商品
     * @param goods
     * @return
     */
    @RequestMapping(value = "/goods", method = RequestMethod.PUT)
    public Result updateGoods(@RequestBody Goods goods) {
        goodsService.updateGoods(goods);
        return Result.success(null);
    }

    /**
     * 查询商品列表
     * @param query
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Result findGoodsList(BaseQueryVo query) {
        PageInfo<List<Goods>> pageInfo = goodsService.findGoodsList(query);
        return Result.success(Pagination.of(pageInfo));
    }
}
