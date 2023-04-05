package com.javabytes.onlinebookstore;

import java.util.HashSet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.javabytes.onlinebookstore.Models.Author;
import com.javabytes.onlinebookstore.Models.Book;
import com.javabytes.onlinebookstore.Repositories.AuthorRepository;
import com.javabytes.onlinebookstore.Repositories.BookRepository;

@SpringBootTest
class OnlineBookstoreApplicationTests {
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Autowired
	BookRepository bookRepository;

	@Test
	void createAuthorAndBooks() {
			
		Author author = new Author();
		author.setName("Shakespeare");
		HashSet<Book> books = new HashSet<Book>();
		books.add(new Book("Hamlet", author));
		books.add(new Book("Macbeth", author));
		author.setBooks(books);
		authorRepository.save(author);
	}

}
