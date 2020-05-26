package com.github.hcsp.Service;

import com.github.hcsp.Dao.DataMapper;
import com.github.hcsp.Entity.Goods;
import com.github.hcsp.Entity.SaleOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: GoFocus
 * @Date: 2020-05-26 14:15
 * @Description:
 */

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private DataMapper dataMapper;

    @Override
    public List<Goods> findAllGoods() {
        return dataMapper.findAllGoods();
    }

    @Override
    public List<SaleOrder> getSaleOrder() {
        return dataMapper.getSaleOrder();
    }

}