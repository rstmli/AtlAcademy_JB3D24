package az.student.studentapp.service;

import az.student.studentapp.dto.StudentRequestDto;
import az.student.studentapp.dto.StudentResponseDto;

import java.util.List;

public interface StudentService{
    void postStudent(StudentRequestDto dto);
    List<StudentResponseDto> getALl();
    Long update(Long id, StudentRequestDto dto);
    Long delete(Long id);
    List<StudentResponseDto> getnaem(String name);
}
