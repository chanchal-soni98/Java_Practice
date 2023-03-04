package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Book;

@RestController
public class MyController {
	@GetMapping("/bookservice/books")
	public List<Book> getBookDetails(){
		
		List<Book> book = new ArrayList<>();
		
		book.add(new Book(1,"book1","chanchal","7th","AB",23,234));
		
		return book;
	}
	@GetMapping("/bookservice/books/{bookId}")
	public Book getBookById(@PathVariable("bookId") Integer bookId) {
		Book b = new Book(bookId,"book1","chanchal","7th","AB",23,234);
		return b;
	}
	
	@PostMapping("/bookservice/books")
	public Book createBook(@RequestBody Book book) {
		
		return book;
	}
	
	@DeleteMapping("/bookservice/books/{bookId}")
	public String deleteBook(@RequestBody Book book, @PathVariable Integer bookId) {
		
		return "delete: "+book;
	}
	
	@PutMapping(value = "/books/{bookId}")
	public Book updateStudentHandler(@RequestBody Book book,@PathVariable("bookId")int bookId) {
		
			//dummy logic
			book.setCategory("A");
			book.setBookId(bookId);
			
			
			return book;
		}

}
