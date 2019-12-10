package com.qf.service;

import com.qf.pojo.Cars;

import java.util.List;

public interface BackStageCarsService {
    //商品管理
    //查询所有商品
    List<Cars> selectAllCars();
    //增加商品
    void insertCars(Cars cars);
    //修改商品
    void updateCars(Cars cars);
    //删除商品
    void deleteCars(Integer id);

}
