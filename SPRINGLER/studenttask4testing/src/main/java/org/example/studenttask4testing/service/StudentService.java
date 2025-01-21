package org.example.studenttask4testing.service;

import org.example.studenttask4testing.dao.entity.StudentEntity;
import org.example.studenttask4testing.dto.StudentRequestDto;
import org.example.studenttask4testing.dto.StudentResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// @component / @repository / @service

public interface StudentService {
    void addStudent(StudentRequestDto dto);
    List<StudentResponseDto> getStudent(StudentResponseDto dto);
    StudentResponseDto findStudentById(Long id);
    Long studentupdate(StudentRequestDto dto, Long id);
    Long deleteStudent(Long id);
}
