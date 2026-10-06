package com.polytech.ludotech.service;

import com.polytech.ludotech.dto.BookDTO;
import com.polytech.ludotech.mappers.BookMapper;
import com.polytech.ludotech.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookService(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    public List<BookDTO> getAllBooks() {
        return bookMapper.toDTO(bookRepository.findAll());
    }
}
