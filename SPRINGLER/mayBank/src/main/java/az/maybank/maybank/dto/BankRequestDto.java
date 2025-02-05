package az.maybank.maybank.dto;


import az.maybank.maybank.dao.entity.UserEntity;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class BankRequestDto {
    private String name;
    private List<UserEntity> userEntityList;
}
