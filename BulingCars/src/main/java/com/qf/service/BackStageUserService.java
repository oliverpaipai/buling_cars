package com.qf.service;

import com.qf.pojo.Cars;
import com.qf.pojo.Users;

import java.util.List;

public interface BackStageUserService {
    //用户管理

    //获取所有用户
    List<Users> selectAllUsers();
    //修改用户
    void updateUsers(Users users);
    //删除用户
    void deleteUsers(Integer id);


}
