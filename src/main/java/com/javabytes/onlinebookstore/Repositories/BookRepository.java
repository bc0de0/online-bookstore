package com.javabytes.onlinebookstore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javabytes.onlinebookstore.Models.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
