package com.example.springboot.dao.entity;

import jakarta.persistence.*;
import jdk.jfr.StackTrace;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Student2")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lname;
    private String fname;

}
