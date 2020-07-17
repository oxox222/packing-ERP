package com.plz.modules.controller;

import com.github.pagehelper.PageInfo;
import com.plz.modules.model.FetchRecord;
import com.plz.modules.model.Pagination;
import com.plz.modules.model.Result;
import com.plz.modules.model.SaveRecord;
import com.plz.modules.service.RepertoryService;
import com.plz.modules.vo.RecordQueryVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName: RepertoryController
 * @Description: 库存管理接口
 * @Author: PANLVZ
 * @Date: 2020/7/4
 */
@RestController
@RequestMapping("/repertory")
public class RepertoryController {

    @Resource
    private RepertoryService repertoryService;

    /**
     * 新增入库单
     * @param saveRecord
     * @return
     */
    @RequestMapping(value = "/saveRecord", method = RequestMethod.PUT)
    public Result insertSaveRecord(@RequestBody SaveRecord saveRecord) {
        repertoryService.insertSaveRecord(saveRecord);
        return Result.success(null);
    }

    /**
     * 新增出库单
     * @param fetchRecord
     * @return
     */
    @RequestMapping(value = "/fetchRecord", method = RequestMethod.PUT)
    public Result insertFetchRecord(@RequestBody FetchRecord fetchRecord) {
        repertoryService.insertFetchRecord(fetchRecord);
        return Result.success(null);
    }

    /**
     * 查询出库单列表
     * @param query
     * @return
     */
    @GetMapping("/fetchRecord")
    public Result fetchRecordList(RecordQueryVo query) {
        PageInfo pageInfo = repertoryService.getFetchRecordList(query);
        return Result.success(Pagination.of(pageInfo));
    }

    /**
     * 查询入库单列表
     * @param query
     * @return
     */
    @GetMapping("/saveRecord")
    public Result saveRecordList(RecordQueryVo query) {
        PageInfo pageInfo = repertoryService.getSaveRecordList(query);
        return Result.success(Pagination.of(pageInfo));
    }

    /**
     * 查询出库单详情
     * @param id
     * @return
     */
    @GetMapping("/fetchRecord/detail/{id}")
    public Result fetchRecordDetails(@PathVariable("id") int id) {
        FetchRecord fetchRecord = repertoryService.fetchRecordDetails(id);
        return Result.success(fetchRecord);
    }

    /**
     * 查询入库单详情
     * @param id
     * @return
     */
    @GetMapping("/saveRecord/detail/{id}")
    public Result saveRecordDetails(@PathVariable("id") int id) {
        SaveRecord saveRecord = repertoryService.saveRecordDetails(id);
        return Result.success(saveRecord);
    }
}
