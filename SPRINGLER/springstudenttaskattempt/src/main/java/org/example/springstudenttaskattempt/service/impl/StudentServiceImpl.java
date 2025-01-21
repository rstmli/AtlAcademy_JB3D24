package org.example.springstudenttaskattempt.service.impl;

import lombok.*;
import org.example.springstudenttaskattempt.dao.entity.StudentEntity;
import org.example.springstudenttaskattempt.dao.repository.StudentRepository;
import org.example.springstudenttaskattempt.dto.StudentRequestsDto;
import org.example.springstudenttaskattempt.dto.StudentResponseDto;
import org.example.springstudenttaskattempt.mapper.StudentMapper;
import org.example.springstudenttaskattempt.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
@RequiredArgsConstructor
@Builder
public class StudentServiceImpl implements StudentService {
    private  final StudentRepository studentRepository;
    private  final StudentMapper studentMapper;
    @Override
    public void addStudent(StudentRequestsDto dto) {
        StudentEntity studentEntity = StudentEntity.builder().name(dto.getName()).surname(dto.getSurname()).gender(dto.getGender()).build();
        studentRepository.save(studentEntity);


    }

    @Override
    public List<StudentResponseDto> getStudents() {
        List<StudentEntity> studentEntity = studentRepository.findAll();
        return studentMapper.getStudents(studentEntity);
    }

    @Override
    public StudentResponseDto findById(Long id) {
        Optional<StudentEntity> optionalStudentEntity = studentRepository.findById(id);
        StudentEntity studentEntity = StudentEntity.builder().build();
        if(optionalStudentEntity.isPresent()){
            return studentMapper.getByIdFind(optionalStudentEntity.get());
        }
        return studentMapper.getByIdFind(studentEntity);
    }

    @Override
    public Long updateStudent(StudentResponseDto dto, Long id) {
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
}
