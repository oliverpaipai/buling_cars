package com.qf.mapper;

import com.qf.pojo.Bookmark;
import com.qf.pojo.BookmarkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookmarkMapper {
    int countByExample(BookmarkExample example);

    int deleteByExample(BookmarkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bookmark record);

    int insertSelective(Bookmark record);

    List<Bookmark> selectByExample(BookmarkExample example);

    Bookmark selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bookmark record, @Param("example") BookmarkExample example);

    int updateByExample(@Param("record") Bookmark record, @Param("example") BookmarkExample example);

    int updateByPrimaryKeySelective(Bookmark record);

    int updateByPrimaryKey(Bookmark record);
}