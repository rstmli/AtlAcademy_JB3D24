package az.student.studentapp.dto;

import az.student.studentapp.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class StudentResponseDto {
    private Long id;
    private String name;
    private String surname;
    private Gender gender;

}
