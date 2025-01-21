package org.example.springstudenttaskattempt.mapper;

import org.example.springstudenttaskattempt.dao.entity.StudentEntity;
import org.example.springstudenttaskattempt.dto.StudentRequestsDto;
import org.example.springstudenttaskattempt.dto.StudentResponseDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public List<StudentResponseDto> getStudents(List<StudentEntity> e){
        List<StudentResponseDto> dtos = new ArrayList<>();
        for(StudentEntity e1: e){
            StudentResponseDto dto = StudentResponseDto.builder().name(e1.getName()).build();
            dtos.add(dto);
        }
        return dtos;
    }
    public StudentResponseDto getByIdFind(StudentEntity e){
        return StudentResponseDto.builder().name(e.getName()).surname(e.getSurname()).gender(e.getGender()).build();
    }
}
