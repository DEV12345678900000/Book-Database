package com.example.bookProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookProject.entity.Book;

public interface BookRepo extends JpaRepository<Book,Long> {

}
