package com.qf.mapper;

import com.qf.pojo.Carts;
import com.qf.pojo.CartsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartsMapper {
    int countByExample(CartsExample example);

    int deleteByExample(CartsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Carts record);

    int insertSelective(Carts record);

    List<Carts> selectByExample(CartsExample example);

    Carts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Carts record, @Param("example") CartsExample example);

    int updateByExample(@Param("record") Carts record, @Param("example") CartsExample example);

    int updateByPrimaryKeySelective(Carts record);

    int updateByPrimaryKey(Carts record);

    List<Carts> selectAllCarts();



}