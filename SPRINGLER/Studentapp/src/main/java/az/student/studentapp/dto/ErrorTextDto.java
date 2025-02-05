package az.student.studentapp.dto;

import az.student.studentapp.util.StudentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorTextDto {
    private StudentStatus status;
    private String message;

}
