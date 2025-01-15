package com.example.springboot.controller;

import com.example.springboot.dao.entity.StudentEntity;
import com.example.springboot.dao.repository.StudentRepository;
import com.example.springboot.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/student")
public class StudentController {
    private final StudentService studentService;
    private final StudentRepository studentRepository;

    @PostMapping
    public void addAccount(@RequestBody StudentEntity entity){
        studentService.addStudent(entity);
    }
    @GetMapping("/get")
    public List<StudentEntity> getStudent() {
       return studentService.getStudent2();

    }
}
