package az.student.studentapp.service;

import az.student.studentapp.dto.JoinDto;
import az.student.studentapp.dto.StudentRequestDto;
import az.student.studentapp.dto.StudentResponseDto;

import java.util.List;

public interface StudentServices {
    void postStudent(StudentRequestDto dto);
    List<StudentResponseDto> getALl();
    StudentResponseDto update(Long id, StudentRequestDto dto);
    Long delete(Long id);
    List<StudentResponseDto> getname(String name);
    List<JoinDto> leftJoin();
    List<JoinDto> rightJoin();
    List<JoinDto> innerJoin();
    List<JoinDto> fullJoin();
}
