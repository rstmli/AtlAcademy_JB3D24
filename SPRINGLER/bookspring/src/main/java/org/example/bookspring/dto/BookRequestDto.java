package org.example.bookspring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.bookspring.util.Genre;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BookRequestDto {
    private String bookname;
    private String author;
    private Genre genre;
}
