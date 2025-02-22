package az.maybank.maybank.dto;

import az.maybank.maybank.util.StudentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorTextDto {
    private StudentStatus status;
    private String message;
}
