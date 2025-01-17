package org.example.bookspring.controller;

import lombok.RequiredArgsConstructor;
import org.example.bookspring.dao.repository.BookRepository;
import org.example.bookspring.dao.entity.BookEntity;
import org.example.bookspring.dto.BookRequestDto;
import org.example.bookspring.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("api/v1/book")
@RequiredArgsConstructor
public class BookControler {
    private final BookService bookService;
    private final BookRepository bookRepository;

    @PostMapping("post")
    public void getPost(@RequestBody BookRequestDto dto){
        bookService.post(dto);
    }
    @GetMapping("get")
    public List<BookRequestDto> getbook(){
        return bookService.getBooks();
    }
}
