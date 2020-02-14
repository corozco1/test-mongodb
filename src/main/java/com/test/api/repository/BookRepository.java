package com.test.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.api.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
