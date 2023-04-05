package com.javabytes.onlinebookstore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javabytes.onlinebookstore.Models.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
