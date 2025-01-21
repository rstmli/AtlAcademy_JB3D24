package org.example.studenttask4testing.mapper;

import lombok.*;
import org.example.studenttask4testing.dao.entity.StudentEntity;
import org.example.studenttask4testing.dao.repository.StudentRepository;
import org.example.studenttask4testing.dto.StudentRequestDto;
import org.example.studenttask4testing.dto.StudentResponseDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Builder
@Data
public class StudentMapper {
    private StudentRepository studentRepository;
    public List<StudentRequestDto> addStudent(List<StudentEntity> entities){
        List<StudentRequestDto> dtos = new ArrayList<>();

        for(StudentEntity e:entities){
            StudentRequestDto dto = StudentRequestDto.builder().name(e.getName()).surname(e.getSurname()).gender(e.getGender()).build();
            dtos.add(dto);
        }
        return dtos;
    }


    public List<StudentResponseDto> getEntityToDtoList(List<StudentEntity> entities){
        List<StudentResponseDto> dtos = new ArrayList<>();
        for(StudentEntity e : entities){
            var dto = StudentResponseDto.builder().name(e.getName()).surname(e.getSurname()).gender(e.getGender()).build();
            dtos.add(dto);
        }
        return dtos;
    }
    public StudentResponseDto getStudentByIdToDtoList(StudentEntity e){
        var dto = StudentResponseDto.builder().name(e.getName()).surname(e.getSurname()).gender(e.getGender()).build();
        return dto;


    }



}