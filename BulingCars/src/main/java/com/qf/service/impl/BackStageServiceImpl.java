package com.qf.service.impl;

import com.qf.mapper.UsersMapper;
import com.qf.pojo.Cars;
import com.qf.pojo.Users;
import com.qf.service.BackStageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BackStageServiceImpl implements BackStageService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> selectAllUsers() {
        List<Users> users=usersMapper.selectAllUsers();
        return users;
    }

    @Override
    public void updateUsers(Users users) {
        usersMapper.updateByPrimaryKey(users);
    }

    @Override
    public void deleteUsers(Integer id) {

    }

    @Override
    public List<Cars> selectAllCars() {
        return null;
    }

    @Override
    public void insertCars(Cars cars) {

    }

    @Override
    public void updateCars(Integer id) {

    }

    @Override
    public void deleteCars(Integer id) {

    }
}
