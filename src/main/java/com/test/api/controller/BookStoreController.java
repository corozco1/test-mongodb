package com.test.api.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.api.model.Book;
import com.test.api.repository.BookRepository;


@RestController
@RequestMapping("/bookstore")
public class BookStoreController {
	
	@Autowired
	private BookRepository repository;
	
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {
		repository.save(book);
		return "Add Book Id: "+book.getId();
	}
	
	@GetMapping("/findBooks")
	public List<Book> getBooks(){
		return repository.findAll();
	}
	
	@GetMapping("/findBooks/{id}")
	public Optional<Book> getBook(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id) {
		repository.deleteById(id);
		return "book delete id: "+id; 
	}
}
