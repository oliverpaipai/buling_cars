package com.qf.service;

import com.qf.pojo.Carts;

import java.util.List;

public interface CartsService {

    //将用户id和车id添加到数据库
    void insertCarts(Carts carts);

    //查询购物车中用户所添加的车辆信息
    List<Carts> findCarts();

    //根据购物车车id和车id

}
