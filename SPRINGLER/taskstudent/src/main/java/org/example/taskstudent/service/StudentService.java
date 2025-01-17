package org.example.taskstudent.service;

import org.example.taskstudent.dto.StudentRequestsDto;
import org.example.taskstudent.dto.StudentResponseDto;

import java.util.List;

public interface StudentService {
    void addStudent(StudentRequestsDto dto);
    List<StudentResponseDto> getAll();
    StudentResponseDto getAllId(Long id);
    Long update(Long id,StudentRequestsDto dto);
}
