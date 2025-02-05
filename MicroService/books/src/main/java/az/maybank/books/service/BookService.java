package az.maybank.books.service;

import az.maybank.books.dto.BookResponseDto;

import java.util.List;
import java.util.Map;

public interface BookService {
    Map<String, List<BookResponseDto>> getBooks();
}
