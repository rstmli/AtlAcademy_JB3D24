package org.example.springstudenttaskattempt.dto;

import lombok.*;
import org.example.springstudenttaskattempt.util.enums.Gender;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class StudentRequestsDto {
    private String name;
    private String surname;
    private Gender gender;
}
