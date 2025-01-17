package org.example.bookspring.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.bookspring.dao.entity.BookEntity;
import org.example.bookspring.dao.repository.BookRepository;
import org.example.bookspring.dto.BookRequestDto;
import org.example.bookspring.mapper.BookMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.awt.print.Book;
import java.util.List;

@RequiredArgsConstructor
@Builder
@Service
public class BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;


    public void post(BookRequestDto dto){
        BookEntity books = BookEntity.builder().author(dto.getAuthor()).bookname(dto.getBookname()).genre(dto.getGenre()).build();
        bookRepository.save(books);

    }

    public List<BookRequestDto> getBooks(){
        var bookEntity = bookRepository.findAll();
            return  bookMapper.bookDtoToEntity(bookEntity);
    }
}
