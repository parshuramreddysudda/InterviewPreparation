package com.springboot.basics.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksControler {
	
	@GetMapping("/books")
	private List<Book> getBooks() {
		return Arrays.asList(new Book(1, "Author", "Name of Book"));
	}
}
   