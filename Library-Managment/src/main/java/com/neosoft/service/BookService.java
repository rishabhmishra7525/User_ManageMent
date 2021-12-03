package com.neosoft.service;

import java.util.List;

import com.neosoft.entity.Book;

public interface BookService {

	Book saveBook(Book book);

	List<Book> findAllBooks();

	List<Book> findbydeptBooks(String dept);

}
