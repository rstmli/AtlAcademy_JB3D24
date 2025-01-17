package org.example.taskstudent.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.taskstudent.util.Gender;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class StudentRequestsDto {
    private String name;
    private String surname;
    private Gender Gender;
}
