package org.example.taskstudent.conmtroller;

import lombok.RequiredArgsConstructor;
import org.example.taskstudent.dao.entity.StudentEntity;
import org.example.taskstudent.dao.repository.StudentRepository;
import org.example.taskstudent.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    private final StudentRepository studentRepository;


    @PostMapping("/post")
    public void postStudent(@RequestBody StudentEntity entity){
        studentService.addPost(entity);
    }
    @GetMapping("/get")
    public List<StudentEntity> getStudent(){
        return studentService.getStudent();
    }

}
