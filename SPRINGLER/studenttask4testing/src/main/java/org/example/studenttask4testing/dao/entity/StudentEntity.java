package org.example.studenttask4testing.dao.entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.*;
import org.example.studenttask4testing.util.enums.Gender;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.time.LocalDate;



@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
@Data
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private Gender gender;
    @Builder.Default
    private LocalDate isRegistered = LocalDate.now();


}
