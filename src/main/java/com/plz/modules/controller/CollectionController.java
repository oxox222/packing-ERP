package com.plz.modules.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.entity.CollectionRecordDto;
import com.plz.modules.model.CollectionRecord;
import com.plz.modules.model.Pagination;
import com.plz.modules.model.Result;
import com.plz.modules.service.CollectionService;
import com.plz.modules.vo.CollectionQueryVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: CollectionController
 * @Description: 收款
 * @Author: PANLVZ
 * @Date: 2022/1/1
 */
@RestController
@RequestMapping("/collection")
public class CollectionController {

    @Resource
    private CollectionService collectionService;

    /**
     * 新增收款信息
     * @return
     */
    @PostMapping
    public Result add(@RequestBody CollectionRecord record) {
        collectionService.add(record);
        return Result.success(null);
    }

    /**
     * 编辑收款单
     * @param record
     * @return
     */
    @PutMapping
    public Result update(@RequestBody CollectionRecord record) {
        collectionService.update(record);
        return Result.success(null);
    }

    /**
     * 删除收款单
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") Integer id) {
        collectionService.delete(id);
        return Result.success(null);
    }

    /**
     * 查询收款信息(分页)
     * @param query
     * @return
     */
    @GetMapping("/page")
    public Result queryByPage(CollectionQueryVo query) {
        Page<CollectionRecordDto> pageInfo = collectionService
                .queryByPage(query, new Page(query.getPageNum(), query.getPageSize()));
        return Result.success(Pagination.of(pageInfo));
    }

    /**
     * 查询收款信息(不分页)
     * @param query
     * @return
     */
    @PostMapping("/all")
    public Result queryByAll(@RequestBody CollectionQueryVo query) {
        List<CollectionRecordDto> list = collectionService.queryByAll(query);
        return Result.success(list);
    }
}
