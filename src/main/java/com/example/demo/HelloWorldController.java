package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Book;





@RestController
public class HelloWorldController {
	
	
	
	@GetMapping("/hello1")  
	public String hello()   
	{  
	return "Hello World";  
	}  
	
	@PostMapping("/postHello")  
	public Book hello(@RequestBody Book bk)  {
		
		return bk;
		
		
	}
	@GetMapping("/getHello")
	public Book getHello() {
		
		Book book =new Book(1,"Java","Kathy","Tech",900.00);
		return book;
	}

}
