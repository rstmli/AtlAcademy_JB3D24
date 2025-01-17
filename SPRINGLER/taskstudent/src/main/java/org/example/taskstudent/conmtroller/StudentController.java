package org.example.taskstudent.conmtroller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.example.taskstudent.dto.StudentRequestsDto;
import org.example.taskstudent.dto.StudentResponseDto;
import org.example.taskstudent.service.StudentService;
import org.example.taskstudent.service.impl.StudentServiceimpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentServiceimpl studentService;



    @PostMapping("/post")
    public void postStudent(@RequestBody StudentRequestsDto dto){
        studentService.addStudent(dto);
    }
    @GetMapping("/get")
    public List<StudentResponseDto> getStudent(){
        return studentService.getAll();
    }

    @GetMapping("get/{id}")
    public StudentResponseDto getstudentid(@PathVariable Long id){
        return studentService.getAllId(id);
    }
    @PostMapping("/update/{id}")
    public Long getUpdate(@RequestBody StudentRequestsDto dto,@PathVariable Long id){
        return studentService.update(id,dto);
    }


}
