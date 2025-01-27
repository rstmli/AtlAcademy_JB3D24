package az.student.studentapp.controller;

import az.student.studentapp.dto.StudentRequestDto;
import az.student.studentapp.dto.StudentResponseDto;
import az.student.studentapp.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @PostMapping("post")
    public void postStudent(@RequestBody StudentRequestDto dto){
        studentService.postStudent(dto);
    }

    @GetMapping("/getall")
    public List<StudentResponseDto> getAll(){
        return studentService.getALl();
    }

    @GetMapping("/getname")
    public List<StudentResponseDto> getName(@RequestParam String name){
        return studentService.getnaem(name);
    }

    @PutMapping("/update/{id}")
    public Long update(@PathVariable Long id,@RequestBody StudentRequestDto dto){
        return studentService.update(id,dto);
    }
    @DeleteMapping("/delete/{id}")
    public Long delete(@PathVariable Long id){
        return studentService.delete(id);
    }
}
