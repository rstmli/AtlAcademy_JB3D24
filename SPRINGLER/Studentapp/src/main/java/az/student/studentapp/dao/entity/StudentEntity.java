package az.student.studentapp.dao.entity;

import az.student.studentapp.util.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class StudentEntity{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String surname;
private Gender gender;
private Long academy_id;

@CreationTimestamp
private LocalDateTime createAt;

@UpdateTimestamp
private LocalDateTime updateAt;

}
