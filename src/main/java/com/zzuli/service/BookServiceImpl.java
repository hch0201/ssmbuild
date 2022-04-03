package com.zzuli.service;

import com.zzuli.dao.BookMapper;
import com.zzuli.pojo.Book;
import com.zzuli.pojo.BookExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hch
 * @date 2022/3/29 - 20:31
 */
@Service
public class BookServiceImpl implements BookService{

    //service层调dao层
    @Autowired
    private BookMapper bookMapper;

    @Override
    public int countByExample(BookExample example) {
        return bookMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BookExample example) {
        return bookMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer bId) {
        return bookMapper.deleteByPrimaryKey(bId);
    }

    @Override
    public int insert(Book record) {
        return bookMapper.insert(record);
    }

    @Override
    public int insertSelective(Book record) {
        return bookMapper.insertSelective(record);
    }

    @Override
    public List<Book> selectByExample(BookExample example) {
        return bookMapper.selectByExample(example);
    }

    @Override
    public Book selectByPrimaryKey(Integer bId) {
        return bookMapper.selectByPrimaryKey(bId);
    }

    @Override
    public int updateByExampleSelective(Book record, BookExample example) {
        return bookMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Book record, BookExample example) {
        return bookMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Book record) {
        return bookMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Book record) {
        return bookMapper.updateByPrimaryKey(record);
    }

    public void setBookMapper(BookMapper bookMapper) {
    }
}
