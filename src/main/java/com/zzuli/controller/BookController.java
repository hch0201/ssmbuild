package com.zzuli.controller;

import com.zzuli.pojo.Book;
import com.zzuli.pojo.BookExample;
import com.zzuli.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

/**
 * @author hch
 * @date 2022/3/29 - 22:31
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询所有书籍 跳转到list页面
    @RequestMapping("/allBook")
    public String getAllBook(
            //@RequestParam(value = "pn",defaultValue = "1")Integer pn,
            Model model){
       // PageHelper.startPage(pn,5);
        List<Book> list = bookService.selectByExample(null);
       // PageInfo pageInfo = new PageInfo(list,5);
        //model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("list",list);
        return "list";
    }

    //跳转到添加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    //添加书籍 并重定向回书籍展示页面
    @RequestMapping("/addBook")
    public String addBook(Book book){
        bookService.insert(book);
        return "redirect:/book/allBook";
    }

    //跳转到修改书籍页面
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id,Model model){
        Book book = bookService.selectByPrimaryKey(id);
        model.addAttribute("QBooks",book);
        return "updateBook";
    }

    //修改书籍 并重定向回书籍展示页面
    @RequestMapping("/updateBook")
    public String updateBook(Book book){
        bookService.updateByPrimaryKey(book);
        return "redirect:/book/allBook";
    }

    //删除书籍 并重定向回书籍展示页面
    @RequestMapping("/deleteBook")
    public String deleteBook(int id){
        bookService.deleteByPrimaryKey(id);
        return "redirect:/book/allBook";
    }

    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        if (queryBookName == null || queryBookName ==""){
            List<Book> list = bookService.selectByExample(null);
            model.addAttribute("list",list);
            model.addAttribute("error","未查到书籍信息");
            return "list";
        }
        BookExample example = new BookExample();
        BookExample.Criteria criteria = example.createCriteria();
        criteria.andBNameEqualTo(queryBookName);
        List<Book> list = bookService.selectByExample(example);
        model.addAttribute("list",list);
        return "list2";
    }
}
