package org.example.springstudenttaskattempt.controller;

import lombok.RequiredArgsConstructor;
import org.example.springstudenttaskattempt.dto.StudentRequestsDto;
import org.example.springstudenttaskattempt.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/post")
    public void addStudent(@RequestBody StudentRequestsDto dto){
        studentService.addStudent(dto);
    }
}
