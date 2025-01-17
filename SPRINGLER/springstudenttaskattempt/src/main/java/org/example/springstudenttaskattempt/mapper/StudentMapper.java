package org.example.springstudenttaskattempt.mapper;

import org.example.springstudenttaskattempt.dao.entity.StudentEntity;
import org.example.springstudenttaskattempt.dto.StudentRequestsDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentMapper {
    public List<StudentRequestsDto> addUsers(List<StudentEntity> entities){
        List<StudentRequestsDto> dtos = new ArrayList<>();

        for(StudentEntity e: entities){
            StudentRequestsDto dto =  StudentRequestsDto.builder().name(e.getName()).surname(e.getSurname()).gender(e.getGender()).build();

            dtos.add(dto);
        }
        return dtos;
    }
}
