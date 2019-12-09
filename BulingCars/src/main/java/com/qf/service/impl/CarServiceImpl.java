package com.qf.service.impl;

import com.qf.mapper.CarsMapper;
import com.qf.pojo.Cars;
import com.qf.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarsMapper carsMapper;

    @Override
    public List<Cars> findAllCars() {
        List<Cars> cars = carsMapper.selAllCars();

        return cars;
    }

    @Override
    public Cars findById(Integer id) {
        Cars cars = carsMapper.selectByPrimaryKey(id);
        return cars;
    }

    @Override
    public List<Cars> findType(Integer type) {
        List<Cars> list = carsMapper.selType(type);
        return list;
    }
}
