package com.neosoft.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.entity.Book;
import com.neosoft.repo.BookRepo;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepo repo;
	@Override
	public Book saveBook(Book book) {
		return repo.save(book);
	}
	@Override
	public List<Book> findAllBooks() {
		return repo.findAll();
	}
	@Override
	public List<Book> findbydeptBooks(String dept) {
		
		return repo.findAll().stream().filter(b ->b.getDepName().equals(dept))
				.collect(Collectors.toList());
	}

}
