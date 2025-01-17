package org.example.bookspring.mapper;

import org.example.bookspring.dao.entity.BookEntity;
import org.example.bookspring.dto.BookRequestDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookMapper {
    public List<BookRequestDto> bookDtoToEntity(List<BookEntity> entities){
        List<BookRequestDto> dtos = new ArrayList<>();
        for(BookEntity e : entities){
            BookRequestDto dto = BookRequestDto.builder().author(e.getAuthor()).bookname(e.getBookname()).genre(e.getGenre()).build();
            dtos.add(dto);
        }
        return dtos;
    }
}
