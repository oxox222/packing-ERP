package com.plz.modules.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plz.modules.model.FetchRecord;
import com.plz.modules.model.Pagination;
import com.plz.modules.model.Result;
import com.plz.modules.model.SaveRecord;
import com.plz.modules.service.RepertoryService;
import com.plz.modules.vo.FetchRecordQueryVo;
import com.plz.modules.vo.SaveRecordQueryVo;
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
    @RequestMapping(value = "/saveRecord/insert", method = RequestMethod.POST)
    public Result insertSaveRecord(@RequestBody SaveRecord saveRecord) {
        repertoryService.insertSaveRecord(saveRecord);
        return Result.success(null);
    }

    /**
     * 新增出库单
     * @param fetchRecord
     * @return
     */
    @RequestMapping(value = "/fetchRecord/insert", method = RequestMethod.POST)
    public Result insertFetchRecord(@RequestBody FetchRecord fetchRecord) {
        repertoryService.insertFetchRecord(fetchRecord);
        return Result.success(null);
    }

    /**
     * 新增出库单时自动填充入库单信息
     * @return
     */
    @RequestMapping(value = "/fetchAndSaveRecord/insert", method = RequestMethod.POST)
    public Result insertFetchAndSaveRecord(@RequestBody FetchRecord fetchRecord) {
        repertoryService.insertFetchAndSaveRecord(fetchRecord);
        return Result.success(null);
    }

    /**
     * 编辑入库单
     * @param saveRecord
     * @return
     */
    @RequestMapping(value = "/saveRecord/update", method = RequestMethod.PUT)
    public Result updateSaveRecord(@RequestBody SaveRecord saveRecord) {
        repertoryService.updateSaveRecord(saveRecord);
        return Result.success(null);
    }

    /**
     * 编辑出库单
     * @param fetchRecord
     * @return
     */
    @RequestMapping(value = "/fetchRecord/update", method = RequestMethod.PUT)
    public Result updateFetchRecord(@RequestBody FetchRecord fetchRecord) {
        repertoryService.updateFetchRecord(fetchRecord);
        return Result.success(null);
    }

    /**
     * 编辑出库单时编辑入库单信息
     * @param fetchRecord
     * @return
     */
    @RequestMapping(value = "/fetchAndSaveRecord/update", method = RequestMethod.PUT)
    public Result updateFetchAndSaveRecord(@RequestBody FetchRecord fetchRecord) {
        repertoryService.updateFetchAndSaveRecord(fetchRecord);
        return Result.success(null);
    }

    /**
     * 查询入库单列表
     * @return
     */
    @GetMapping("/saveRecord/list")
    public Result saveRecordList(SaveRecordQueryVo query) {
        Page<SaveRecord> pageInfo = repertoryService.
                getSaveRecordList(query, new Page(query.getPageNum(), query.getPageSize()));
        return Result.success(Pagination.of(pageInfo));
    }

    /**
     * 查询出库单列表
     * @return
     */
    @GetMapping("/fetchRecord/list")
    public Result fetchRecordList(FetchRecordQueryVo query) {
        Page<FetchRecord> pageInfo = repertoryService.
                getFetchRecordList(query, new Page(query.getPageNum(), query.getPageSize()));
        return Result.success(Pagination.of(pageInfo));
    }

    /**
     * 删除入库单
     * @param id
     * @return
     */
    @RequestMapping(value = "/saveRecord/delete/{id}", method = RequestMethod.DELETE)
    public Result deleteSaveRecord(@PathVariable("id") Integer id) {
        repertoryService.deleteSaveRecord(id);
        return Result.success(null);
    }

    /**
     * 删除出库单时删除入库单
     * @param id 出库单id
     * @return
     */
    @RequestMapping(value = "/fetchAndSaveRecord/delete/{id}", method = RequestMethod.DELETE)
    public Result deleteFetchAndSaveRecord(@PathVariable("id") Integer id) {
        repertoryService.deleteFetchAndSaveRecord(id);
        return Result.success(null);
    }

    /**
     * 删除出库单
     * @param id
     * @return
     */
    @RequestMapping(value = "/fetchRecord/delete/{id}", method = RequestMethod.DELETE)
    public Result deleteRetchRecord(@PathVariable("id") Integer id) {
        repertoryService.deleteFetchRecord(id);
        return Result.success(null);
    }

    /**
     * 发货
     * @param id
     * @return
     */
    @RequestMapping(value = "/fetchRecord/deliver/{id}", method = RequestMethod.PUT)
    public Result deliver(@PathVariable("id") Integer id) {
        repertoryService.deliver(id);
        return Result.success(null);
    }

    /**
     * 签收
     * @param id
     * @return
     */
    @RequestMapping(value = "/fetchRecord/sign/{id}", method = RequestMethod.PUT)
    public Result sign(@PathVariable("id") Integer id) {
        repertoryService.sign(id);
        return Result.success(null);
    }

}
