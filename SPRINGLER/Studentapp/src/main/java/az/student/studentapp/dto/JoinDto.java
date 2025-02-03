package az.student.studentapp.dto;


import az.student.studentapp.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoinDto {
    private String studentName;
    private String fidan;
    private String academyName;
}
