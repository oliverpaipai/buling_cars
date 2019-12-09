package com.qf.service;

import com.qf.pojo.Cars;

import java.util.List;

public interface CarService {

    //查询所有车辆
    List<Cars> selAllCars();

    //根据id查询车
    Cars selById(Integer id);

    //根据类型查询车辆
    List<Cars> selType(Integer type);
}
