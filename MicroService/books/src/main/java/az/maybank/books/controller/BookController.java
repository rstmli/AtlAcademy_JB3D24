package az.maybank.books.controller;

import az.maybank.books.dto.BookResponseDto;
import az.maybank.books.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/book")
public class BookController {
    private final BookService bookService;
    @GetMapping("/get")
    public Map<String, List<BookResponseDto>> getbooks(){
        return bookService.getBooks();
    }


}
