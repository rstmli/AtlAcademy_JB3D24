package az.student.studentapp.dto;


import az.student.studentapp.util.Gender;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor
public class StudentRequestDto {
    private String name;
    private String surname;
    private Gender gender;
}
