package org.example.springstudenttaskattempt.dao.entity;


import jakarta.persistence.*;
import lombok.*;
import org.example.springstudenttaskattempt.util.enums.Gender;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_surname")
    private String surname;
    private Gender gender;

}
