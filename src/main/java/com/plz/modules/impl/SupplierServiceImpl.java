package com.plz.modules.impl;

import com.plz.modules.mapper.SupplierMapper;
import com.plz.modules.model.Supplier;
import com.plz.modules.service.SupplierService;
import com.plz.modules.vo.SupplierQueryVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

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
    public Integer insert(Supplier supplier) throws Exception {
        if (ifRepetition(supplier.getName())) {
            throw new Exception("该供应商已存在!");
        }
        supplierMapper.insert(supplier);
        return supplier.getId();
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

    /**
     * 判断是否存在重名
     * @param name
     * @return
     */
    private Boolean ifRepetition(String name) {
        return Objects.nonNull(supplierMapper.ifRepetition(name));
    }
}
