package com.example.springboot.service;

import com.example.springboot.dao.entity.StudentEntity;
import com.example.springboot.dao.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

import java.util.List;
@ToString
@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    public void addStudent(StudentEntity entity){
        studentRepository.save(entity);
    }
    public List<StudentEntity> getStudent2() {
        List<StudentEntity> students = studentRepository.findAll();
        students.forEach(student -> System.out.println(student)); // veya log ile yazdır
        return students;
    }
}
