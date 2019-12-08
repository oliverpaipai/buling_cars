package com.qf.mapper;

import com.qf.pojo.Bigpic;
import com.qf.pojo.BigpicExample;
import com.qf.pojo.BigpicKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigpicMapper {
    int countByExample(BigpicExample example);

    int deleteByExample(BigpicExample example);

    int deleteByPrimaryKey(BigpicKey key);

    int insert(Bigpic record);

    int insertSelective(Bigpic record);

    List<Bigpic> selectByExample(BigpicExample example);

    Bigpic selectByPrimaryKey(BigpicKey key);

    int updateByExampleSelective(@Param("record") Bigpic record, @Param("example") BigpicExample example);

    int updateByExample(@Param("record") Bigpic record, @Param("example") BigpicExample example);

    int updateByPrimaryKeySelective(Bigpic record);

    int updateByPrimaryKey(Bigpic record);
}