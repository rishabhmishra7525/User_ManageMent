package com.neosoft.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.entity.Book;
import com.neosoft.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService service;
	
	@PostMapping("/")
	public Book saveBood( @RequestBody Book book) {
		return service.saveBook(book);
	}
	
	
	@GetMapping("/")
	public List<Book> findBood( ) {
		return service.findAllBooks();
	}
	
	
	
	@GetMapping("find/{dept}")
	public List<Book> findBydeptId(@PathVariable String dept) {
		return service.findbydeptBooks(dept);
	}
}
