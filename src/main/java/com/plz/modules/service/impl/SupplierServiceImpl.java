package com.plz.modules.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.plz.modules.mapper.SupplierMapper;
import com.plz.modules.model.Supplier;
import com.plz.modules.service.SupplierService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: SupplierServiceImpl
 * @Description: TODO
 * @Author: PANLVZ
 * @Date: 2020/7/1
 */
@Service
public class SupplierServiceImpl implements SupplierService {

    @Resource
    private SupplierMapper supplierMapper;

    @Override
    public void addSupplier(Supplier supplier) {
        supplierMapper.insertSelective(supplier);
    }

    @Override
    public PageInfo<List<Supplier>> querySupplierList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Supplier> list = supplierMapper.queryList();
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

    @Override
    public void updateSupplier(Supplier supplier) {
        supplierMapper.updateById(supplier);
    }

    @Override
    public void deleteById(int id) {
        supplierMapper.deleteById(id);
    }
}
