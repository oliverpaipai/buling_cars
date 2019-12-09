package com.qf.service;

import com.qf.pojo.Cars;

import java.util.List;

public interface CarService {

    //查询所有车辆
    List<Cars> findAllCars();

    //根据id查询车
    Cars findById(Integer id);

    //根据类型查询车辆
    List<Cars> findType(Integer type);
}
