package org.example.bookspring.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.bookspring.util.Genre;

@Entity
@Table(name = "books2")
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookname;
    private String author;
    private Genre genre;

}
