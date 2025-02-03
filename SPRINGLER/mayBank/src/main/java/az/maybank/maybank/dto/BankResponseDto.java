package az.maybank.maybank.dto;

import az.maybank.maybank.dao.entity.UserEntity;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Builder
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class BankResponseDto {
    private String name;
    private List<UserResponseDto> userEntityList;

}
