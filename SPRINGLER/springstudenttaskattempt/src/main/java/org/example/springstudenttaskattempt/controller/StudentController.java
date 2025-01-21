package org.example.springstudenttaskattempt.controller;

import lombok.RequiredArgsConstructor;
import org.example.springstudenttaskattempt.dto.StudentRequestsDto;
import org.example.springstudenttaskattempt.dto.StudentResponseDto;
import org.example.springstudenttaskattempt.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/post")
    public void addStudent(@RequestBody StudentRequestsDto dto){
        studentService.addStudent(dto);
    }

    @GetMapping("get")
    public List<StudentResponseDto> getStudent(){
        return studentService.getStudents();
    }
    @GetMapping("get/{id}")
    public StudentResponseDto getstudentid(@PathVariable Long id){
        return studentService.findById(id);
    }
    @PostMapping("/update/{id}")
    public Long getUpdate(@RequestBody StudentResponseDto dto,@PathVariable Long id){
        return studentService.updateStudent(dto,id);
    }


}
