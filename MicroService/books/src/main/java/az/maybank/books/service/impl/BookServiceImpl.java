package az.maybank.books.service.impl;

import az.maybank.books.client.AliveninoClient;
import az.maybank.books.client.LibrafClient;
import az.maybank.books.dto.BookResponseDto;
import az.maybank.books.mapper.BookMapper;
import az.maybank.books.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookMapper bookMapper;
    private final AliveninoClient aliveninoClient;
    private final LibrafClient librafClient;
    @Override
    public Map<String, List<BookResponseDto>> getBooks() {
        var a = aliveninoClient.getAll();
        var l = librafClient.getAll();

        return bookMapper.categorizeBooks(l,a);
    }
}
