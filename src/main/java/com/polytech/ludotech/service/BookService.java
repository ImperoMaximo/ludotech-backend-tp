package com.polytech.ludotech.service;

import com.polytech.ludotech.entity.BookEntity;
import com.polytech.ludotech.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BookEntity> getAllBooks() {
        return bookRepository.findAll();
    }
}
