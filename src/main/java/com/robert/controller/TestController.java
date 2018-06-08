package com.robert.controller;

import com.robert.common.ResponseData;
import com.robert.entity.Book;
import com.robert.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/test",produces = "application/json;charset=UTF-8")
public class TestController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/sayHello")
    @ResponseBody
    public Object sayHello(){
        Book spring = new Book("Spring cloud in Action");
        bookService.createBook(spring);

        ResponseData response=new ResponseData();
        response.setData(spring.getAuthors());
        response.setMsg("操作成功");
        return response;
    }

}
