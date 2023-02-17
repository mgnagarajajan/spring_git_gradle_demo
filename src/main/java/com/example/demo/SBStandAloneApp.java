package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.bean.Book;



//@SpringBootApplication
public class SBStandAloneApp implements CommandLineRunner{
	
	@Autowired
	MongoDBManager mongoDBManager;
	
	public static void main(String args[]) {
		SpringApplication.run(SBStandAloneApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			
			
			System.out.println("Hello Word");
			
			Book book =new Book(1,"Java","Kathy","Tech",900.00);
			mongoDBManager.addBook(book);
			Book book1 =new Book(2,"Springboot","Kim","Course",900.00);
			mongoDBManager.addBook(book1);
			
			List<Book> list=mongoDBManager.getAll();
			
			for(Book bk:list) {
				
				System.out.println(bk.getAuthor());
			}
			
			Book bkfind=mongoDBManager.findById(1);
			System.out.println(bkfind);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.exit(0);
		}
		
		
		
	}
	
	
	

}
