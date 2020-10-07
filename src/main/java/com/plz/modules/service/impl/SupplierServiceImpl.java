package com.plz.modules.service.impl;

import com.plz.modules.mapper.SupplierMapper;
import com.plz.modules.model.Supplier;
import com.plz.modules.service.SupplierService;
import com.plz.modules.vo.SupplierQueryVo;
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
    public void insert(Supplier supplier) {
        supplierMapper.insert(supplier);
    }

    @Override
    public List<Supplier> list(SupplierQueryVo query) {
        List<Supplier> list = supplierMapper.list(query);
        return list;
    }

    @Override
    public void update(Supplier supplier) {
        supplierMapper.updateById(supplier);
    }

    @Override
    public void delete(int id) {
        supplierMapper.deleteById(id);
    }
}
