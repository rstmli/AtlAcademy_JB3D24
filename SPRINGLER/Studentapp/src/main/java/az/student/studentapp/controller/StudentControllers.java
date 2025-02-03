package az.student.studentapp.controller;

import az.student.studentapp.dto.JoinDto;
import az.student.studentapp.dto.StudentRequestDto;
import az.student.studentapp.dto.StudentResponseDto;
import az.student.studentapp.service.StudentServices;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/student")
@Slf4j
public class StudentControllers {
    private final StudentServices studentService;

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
        return studentService.getname(name);
    }

    @PutMapping("/update/{id}")
    public StudentResponseDto update(@PathVariable Long id,@RequestBody StudentRequestDto dto){
        return studentService.update(id,dto);
    }
    @DeleteMapping("/delete/{id}")
    public Long delete(@PathVariable Long id){
        return studentService.delete(id);
    }

    @GetMapping("/leftjoin")
    public List<JoinDto>  leftJoin(){
        log.info("sol table butun rowlar ve sag table kesishme rowlar");
        return studentService.leftJoin();
    }

    @GetMapping("/rightjoin")
    public List<JoinDto> rightJoin(){
        var b = studentService.rightJoin();

        return b;
    }

    @GetMapping("/innerjoin")
    public List<JoinDto> innerJoin(){
        log.error("2 table kesishme rowlar");
        return studentService.innerJoin();
    }

    @GetMapping("/fulljoin")
    public List<JoinDto> fullJoin(){
        log.info("2 table butun rowlar");
        return studentService.fullJoin();
    }
}
