package org.example.taskstudent.service;

import lombok.*;
import org.example.taskstudent.dao.entity.StudentEntity;
import org.example.taskstudent.dao.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Getter
public class StudentService {
    private final StudentRepository studentRepository;

    public void addPost(StudentEntity entity){
        studentRepository.save(entity);
    };

    public List<StudentEntity> getStudent(){
        return studentRepository.findAll();
    }




}
