package org.example.taskstudent.mapper;


import org.example.taskstudent.dao.entity.StudentEntity;
import org.example.taskstudent.dto.StudentResponseDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentMapper {
    public List<StudentResponseDto> studentDtoToEntity(List<StudentEntity> entities){
        List<StudentResponseDto> dtos = new ArrayList<>();
        for(StudentEntity e : entities){
            StudentResponseDto dto = StudentResponseDto.builder()
                    .name(e.getName()).surname(e.getSurname()).Gender(e.getGender()).build();
            dtos.add(dto);
        }
        return dtos;

    }
    public List<StudentResponseDto> bookDtoToEntity(List<StudentEntity> entities){
        List<StudentResponseDto> dtos = new ArrayList<>();
        for(StudentEntity e : entities){
            StudentResponseDto dto = StudentResponseDto.builder().name(e.getName()).surname(e.getSurname()).Gender(e.getGender()).build();
            dtos.add(dto);
        }
        return dtos;
    }
    public StudentResponseDto studentEntityTODtoById(StudentEntity e){
        return StudentResponseDto.builder().name(e.getName()).surname(e.getSurname()).Gender(e.getGender()).build();
    }



}
