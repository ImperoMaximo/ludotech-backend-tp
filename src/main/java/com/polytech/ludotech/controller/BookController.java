package com.polytech.ludotech.controller;

import com.polytech.ludotech.dto.BookDTO;
import com.polytech.ludotech.mappers.BookMapper;
import com.polytech.ludotech.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;
    private final BookMapper bookMapper;

    public BookController(BookService bookService, BookMapper bookMapper) {
        this.bookService = bookService;
        this.bookMapper = bookMapper;
    }

    @GetMapping
    public List<BookDTO> getAllBooks() {
        return bookMapper.toDTO(bookService.getAllBooks());
    }
}
