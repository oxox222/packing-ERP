package com.plz.modules.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.model.CancelRecord;
import com.plz.modules.model.Pagination;
import com.plz.modules.model.Result;
import com.plz.modules.service.CancelService;
import com.plz.modules.vo.CancelQueryVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 退货管理接口
 * Created by PANLVZ on 2021/11/19
 */
@RestController
@RequestMapping("/cancel")
public class CancelController {

    @Resource
    private CancelService cancelService;

    /**
     * 新增退货单
     * @param cancelRecord
     * @return
     */
    @PostMapping()
    public Result add(@RequestBody CancelRecord cancelRecord) {
        cancelService.add(cancelRecord);
        return Result.success(null);
    }

    /**
     * 修改退货单
     * @param cancelRecord
     * @return
     */
    @PutMapping
    public Result update(@RequestBody CancelRecord cancelRecord) {
        cancelService.update(cancelRecord);
        return Result.success(null);
    }

    /**
     * 删除退货单
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id")Integer id) {
        cancelService.delete(id);
        return Result.success(null);
    }

    /**
     * 退货单分页查询
     * @param query
     * @return
     */
    @GetMapping("/page")
    public Result queryByPage(CancelQueryVo query) {
        Page<CancelRecord> pageInfo = cancelService.
                queryByPage(query, new Page(query.getPageNum(), query.getPageSize()));
        return Result.success(Pagination.of(pageInfo));
    }

    /**
     * 退货单查询(不分页)
     * @param query
     * @return
     */
    @GetMapping("/all")
    public Result queryByAll(CancelQueryVo query) {
        List<CancelRecord> list = cancelService.queryByAll(query);
        return Result.success(list);
    }

}
