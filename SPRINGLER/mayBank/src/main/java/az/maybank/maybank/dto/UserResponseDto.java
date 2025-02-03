package az.maybank.maybank.dto;

import az.maybank.maybank.dao.entity.BankEntity;
import lombok.*;
import org.springframework.stereotype.Component;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class UserResponseDto {
    private String name;
    private String surname;
}
