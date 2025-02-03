package az.student.studentapp.dto;


import az.student.studentapp.util.Gender;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequestDto {
    private Long id;
    private String name;
    private String surname;
    private Gender gender;
}
