package com.schoolspider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.schoolspider.model.Greeting;
import com.schoolspider.model.Terms;
import com.schoolspider.service.BookService;

@RestController
public class BooksController {
	
	@Autowired
	private BookService bookService;
  
	
	@RequestMapping("/hello")
    public Greeting getEmployees()
    {
		Greeting g = new Greeting();
		g.setName("Hello");
        return g;
    }
	
	@RequestMapping(value = "terms/{s_class}",method = RequestMethod.GET)
    public @ResponseBody List<Terms> showAppScreenConfig(@PathVariable String s_class){
        return bookService.getTerms(s_class);
    }
	
	@RequestMapping(value = "sclass/{school_id}",method = RequestMethod.GET)
    public @ResponseBody List<Terms> showAppScreenConfig(@PathVariable int school_id){
        return bookService.getSClass(school_id);
    }
}
