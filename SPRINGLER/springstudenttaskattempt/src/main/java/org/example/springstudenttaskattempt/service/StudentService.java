package org.example.springstudenttaskattempt.service;

import lombok.Builder;
import lombok.Data;
import org.example.springstudenttaskattempt.dto.StudentRequestsDto;
import org.example.springstudenttaskattempt.dto.StudentResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    void addStudent(StudentRequestsDto dto);
    List<StudentResponseDto> getStudents();
    StudentResponseDto findById(Long id);
    Long updateStudent(StudentResponseDto dto,Long id);
}
