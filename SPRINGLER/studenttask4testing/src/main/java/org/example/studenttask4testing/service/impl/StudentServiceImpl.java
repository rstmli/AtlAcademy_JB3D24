package org.example.studenttask4testing.service.impl;

import lombok.Data;
import org.example.studenttask4testing.dao.entity.StudentEntity;
import org.example.studenttask4testing.dao.repository.StudentRepository;
import org.example.studenttask4testing.dto.StudentRequestDto;
import org.example.studenttask4testing.dto.StudentResponseDto;
import org.example.studenttask4testing.mapper.StudentMapper;
import org.example.studenttask4testing.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    @Override
    public void addStudent(StudentRequestDto dto) {
        StudentEntity entity = StudentEntity.builder().name(dto.getName()).surname(dto.getSurname()).gender(dto.getGender()).build();
        studentRepository.save(entity);

    }

    @Override
    public List<StudentResponseDto> getStudent(StudentResponseDto dto) {
        List<StudentEntity> entities = studentRepository.findAll();
        return studentMapper.getEntityToDtoList(entities);
    }

    @Override
    public StudentResponseDto findStudentById(Long id) {
        Optional<StudentEntity> optionalStudentEntity = studentRepository.findById(id);
        StudentEntity entity = StudentEntity.builder().build();
        if(optionalStudentEntity.isPresent()){
            return studentMapper.getStudentByIdToDtoList(optionalStudentEntity.get());
        }
        return studentMapper.getStudentByIdToDtoList(entity);
    }

    @Override
    public Long studentupdate(StudentRequestDto dto, Long id) {
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

    @Override
    public Long deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return id;
    }

}
