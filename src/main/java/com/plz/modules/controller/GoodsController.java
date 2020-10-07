package com.plz.modules.controller;

import com.plz.modules.model.Goods;
import com.plz.modules.model.Result;
import com.plz.modules.service.GoodsService;
import com.plz.modules.vo.GoodsQueryVo;
import org.springframework.web.bind.annotation.*;

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
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    /**
     * 新增商品
     * @param goods
     * @return
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Result insert(@RequestBody Goods goods) {
        goodsService.insert(goods);
        return Result.success(null);
    }

    /**
     * 编辑商品
     * @param goods
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Result update(@RequestBody Goods goods) {
        goodsService.update(goods);
        return Result.success(null);
    }

    /**
     * 查询商品列表
     * @param query
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Result list(GoodsQueryVo query) {
        List<Goods> list = goodsService.list(query);
        return Result.success(list);
    }

    /**
     * 删除商品
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") Integer id) {
        goodsService.delete(id);
        return Result.success(null);
    }
}
