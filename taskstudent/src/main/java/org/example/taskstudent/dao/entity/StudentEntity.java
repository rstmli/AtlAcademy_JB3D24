package org.example.taskstudent.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.taskstudent.util.Gender;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "student3")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private Gender Gender;
}
