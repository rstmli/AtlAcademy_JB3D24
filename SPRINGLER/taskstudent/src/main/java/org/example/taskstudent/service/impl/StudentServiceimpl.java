package org.example.taskstudent.service.impl;

import lombok.*;
import org.example.taskstudent.dao.entity.StudentEntity;
import org.example.taskstudent.dao.repository.StudentRepository;
import org.example.taskstudent.dto.StudentRequestsDto;
import org.example.taskstudent.dto.StudentResponseDto;
import org.example.taskstudent.mapper.StudentMapper;
import org.example.taskstudent.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Data
public class StudentServiceimpl implements StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    @Override
    public void addStudent(StudentRequestsDto dto) {
        StudentEntity entity = StudentEntity.builder().name(dto.getName()).surname(dto.getSurname()).Gender(dto.getGender()).build();
        studentRepository.save(entity);
    }

    @Override
    public List<StudentResponseDto> getAll() {
        var studentEntity = studentRepository.findAll();
        return studentMapper.bookDtoToEntity(studentEntity);
    }

    public StudentResponseDto getAllId(Long id){
        Optional<StudentEntity> optionalStudentEntity = studentRepository.findById(id);
        StudentEntity studentEntity = StudentEntity.builder().build();
        if(optionalStudentEntity.isPresent()){
            return studentMapper.studentEntityTODtoById(optionalStudentEntity.get());
        }
        return studentMapper.studentEntityTODtoById(studentEntity);
    }



    @Override
    public Long update(Long id, StudentRequestsDto dto) {
        Optional<StudentEntity> optionalStudentEntity = studentRepository.findById(id);
        if(optionalStudentEntity.isPresent()){
            StudentEntity studentEntity = optionalStudentEntity.get();
            studentEntity.setName(dto.getName());
            studentEntity.setSurname(dto.getSurname());
            studentEntity.setGender(dto.getGender());
            studentRepository.save(studentEntity);
            return id;
        }
        return 0L;
    }


//    solid prinsiplerini arasdir oyren


}
