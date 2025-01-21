package org.example.studenttask4testing.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.studenttask4testing.util.enums.Gender;
import org.springframework.stereotype.Component;

@Component
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponseDto {
    private  String name;
    private  String surname;
    private Gender gender;
}
