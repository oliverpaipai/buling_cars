package com.qf.service;

import com.qf.pojo.Cars;
import com.qf.pojo.Users;

import java.util.List;

public interface BackStageService {
    //用户管理

    //获取所有用户
    List<Users> selectAllUsers();
    //修改用户
    void updateUsers(Users users);
    //删除用户
    void deleteUsers(Integer id);

    //商品管理
    //查询所有商品
    List<Cars> selectAllCars();
    //增加商品
    void insertCars(Cars cars);
    //修改商品
    void updateCars(Integer id);
    //删除商品
    void deleteCars(Integer id);

    //订单管理

}
