package com.zzuli.service;

import com.zzuli.pojo.Book;
import com.zzuli.pojo.BookExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hch
 * @date 2022/3/29 - 20:32
 */
public interface BookService {

    int countByExample(BookExample example);

    int deleteByExample(BookExample example);

    int deleteByPrimaryKey(Integer bId);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> selectByExample(BookExample example);

    Book selectByPrimaryKey(Integer bId);

    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);

    int updateByExample(@Param("record") Book record, @Param("example") BookExample example);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);



}
