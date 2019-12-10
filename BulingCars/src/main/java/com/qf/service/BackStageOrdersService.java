package com.qf.service;

import com.qf.pojo.Orders;

import java.util.List;

public interface BackStageOrdersService {
    //订单管理
    //查询所有订单
    List<Orders> selectAllOrders();
    //修改订单
    void updateOrders(Orders orders);

}
