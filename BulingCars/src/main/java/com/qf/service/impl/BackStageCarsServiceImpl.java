package com.qf.service.impl;

import com.qf.mapper.CarsMapper;
import com.qf.pojo.Cars;
import com.qf.service.BackStageCarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BackStageCarsServiceImpl implements BackStageCarsService {
    @Autowired
    private CarsMapper carsMapper;
    @Override
    public List<Cars> selectAllCars() {
        List<Cars> cars = carsMapper.selectAllCars();
        return cars;
    }

    @Override
    public void insertCars(Cars cars) {
        carsMapper.insert(cars);
    }

    @Override
    public void updateCars(Cars cars) {
        carsMapper.updateByPrimaryKey(cars);
    }

    @Override
    public void deleteCars(Integer id) {
        carsMapper.deleteByPrimaryKey(id);
    }
}
