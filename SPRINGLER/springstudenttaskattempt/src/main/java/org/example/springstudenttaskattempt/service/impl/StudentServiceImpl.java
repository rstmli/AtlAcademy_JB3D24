package org.example.springstudenttaskattempt.service.impl;

import lombok.*;
import org.example.springstudenttaskattempt.dao.entity.StudentEntity;
import org.example.springstudenttaskattempt.dao.repository.StudentRepository;
import org.example.springstudenttaskattempt.dto.StudentRequestsDto;
import org.example.springstudenttaskattempt.mapper.StudentMapper;
import org.example.springstudenttaskattempt.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
@RequiredArgsConstructor
@Builder
public class StudentServiceImpl implements StudentService {
    private  final StudentRepository studentRepository;
    private  final StudentMapper studentMapper;
    @Override
    public void addStudent(StudentRequestsDto dto) {
        StudentEntity studentEntity = StudentEntity.builder().name(dto.getName()).surname(dto.getSurname()).gender(dto.getGender()).build();
        studentRepository.save(studentEntity);


    }
}
