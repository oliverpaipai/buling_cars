package com.qf.service.impl;

import com.qf.mapper.CartsMapper;
import com.qf.pojo.Carts;
import com.qf.service.CartsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CartsServiceImpl implements CartsService {


    @Autowired
    private CartsMapper cartsMapper;


    @Override
    public void insertCarts(Carts carts) {
        cartsMapper.insert(carts);
    }

    @Override
    public List<Carts> findCarts() {
        return cartsMapper.selectAllCarts();
    }
}
