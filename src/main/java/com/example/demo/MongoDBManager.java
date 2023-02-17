package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.apache.el.parser.ELParserTreeConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Book;



@Service
public class MongoDBManager {
	
	@Autowired
	MongoRepository mongoRepository;
	
	
	public Book addBook(Book book) {
		
		try {
			System.out.println("Inside DB");
			return mongoRepository.save(book);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
		
	}
	
	public List<Book> getAll(){
		
		return mongoRepository.findAll();
	}
	
	public Book findById(Integer id){
		Optional opt= mongoRepository.findById(id);
		
		if(opt.isPresent()) {
			return (Book)opt.get();
		}else {
			return null;
		}
	}
	
	

}
