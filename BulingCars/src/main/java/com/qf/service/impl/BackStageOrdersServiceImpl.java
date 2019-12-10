package com.qf.service.impl;

import com.qf.mapper.OrdersMapper;
import com.qf.pojo.Orders;
import com.qf.service.BackStageOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BackStageOrdersServiceImpl implements BackStageOrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public List<Orders> selectAllOrders() {
        List<Orders> orders = ordersMapper.selectAllOrders();
        return orders;
    }

    @Override
    public void updateOrders(Orders orders) {
        ordersMapper.updateByPrimaryKey(orders);
    }
}
