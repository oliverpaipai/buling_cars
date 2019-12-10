package com.qf.mapper;

import com.qf.pojo.Cars;
import com.qf.pojo.CarsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarsMapper {
    int countByExample(CarsExample example);

    int deleteByExample(CarsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cars record);

    int insertSelective(Cars record);

    List<Cars> selectByExample(CarsExample example);

    Cars selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cars record, @Param("example") CarsExample example);

    int updateByExample(@Param("record") Cars record, @Param("example") CarsExample example);

    int updateByPrimaryKeySelective(Cars record);

    int updateByPrimaryKey(Cars record);

    List<Cars> selectAllCars();
}