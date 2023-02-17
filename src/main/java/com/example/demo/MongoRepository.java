package com.example.demo;

import com.example.demo.bean.Book;

public interface MongoRepository extends org.springframework.data.mongodb.repository.MongoRepository<Book, Integer>{

}