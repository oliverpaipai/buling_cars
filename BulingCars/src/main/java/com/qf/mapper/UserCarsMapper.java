package com.qf.mapper;

import com.qf.pojo.UserCars;
import com.qf.pojo.UserCarsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserCarsMapper {
    int countByExample(UserCarsExample example);

    int deleteByExample(UserCarsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserCars record);

    int insertSelective(UserCars record);

    List<UserCars> selectByExample(UserCarsExample example);

    UserCars selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserCars record, @Param("example") UserCarsExample example);

    int updateByExample(@Param("record") UserCars record, @Param("example") UserCarsExample example);

    int updateByPrimaryKeySelective(UserCars record);

    int updateByPrimaryKey(UserCars record);
}