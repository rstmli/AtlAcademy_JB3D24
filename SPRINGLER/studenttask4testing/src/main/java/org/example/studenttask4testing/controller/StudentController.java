package org.example.studenttask4testing.controller;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.studenttask4testing.dto.StudentRequestDto;
import org.example.studenttask4testing.dto.StudentResponseDto;
import org.example.studenttask4testing.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
@Data
@AllArgsConstructor
public class StudentController {

    private StudentService studentService;

    @PostMapping("post")
    public void studentAdd(@RequestBody StudentRequestDto dto){
        studentService.addStudent(dto);
    }
    @GetMapping("/get")
    public List<StudentResponseDto> getStudent(StudentResponseDto dto){
        return studentService.getStudent(dto);
    }
    @GetMapping("/get/{id}")
    public StudentResponseDto getStudentId(@PathVariable Long id){
        return studentService.findStudentById(id);
    }
    @PostMapping("update/{id}")
    public Long updateStudentI(@RequestBody StudentRequestDto dto, @PathVariable Long id){
        return studentService.studentupdate(dto,id);
    }
    @PostMapping("delete/{id}")
    public Long deleteStudent(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }
}
