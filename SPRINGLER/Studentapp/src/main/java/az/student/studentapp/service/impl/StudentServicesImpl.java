package az.student.studentapp.service.impl;

import az.student.studentapp.dao.entity.StudentEntity;
import az.student.studentapp.dao.repository.StudentRepositorys;
import az.student.studentapp.dto.JoinDto;
import az.student.studentapp.dto.StudentRequestDto;
import az.student.studentapp.dto.StudentResponseDto;
import az.student.studentapp.exception.StudentNotFoundException;
import az.student.studentapp.mapper.StudentMapper;
import az.student.studentapp.service.StudentServices;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class StudentServicesImpl implements StudentServices {
    private final StudentRepositorys studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public void postStudent(StudentRequestDto dto) {
        var entity = StudentEntity.builder()
                .name(dto.getName())
                .surname(dto.getSurname())
                .gender(dto.getGender())
                .build();
        studentRepository.save(entity);
    }

    @Override
    public List<StudentResponseDto> getALl() {
        var entity  = studentRepository.findAll();
        return studentMapper.entityToListDto(entity);
    }

    @Override
    public StudentResponseDto update(Long id, StudentRequestDto dto) {
        StudentEntity optionalStudentEntity = studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("id Not found"));

            StudentEntity studentEntity = optionalStudentEntity;
            studentEntity.setName(dto.getName());
            studentEntity.setSurname(dto.getSurname());
            studentEntity.setGender(dto.getGender());
            studentRepository.save(studentEntity);
        return StudentResponseDto.builder().id(dto.getId()).name(dto.getName()).surname(dto.getSurname()).gender(dto.getGender()).build();
    }

    @Override
    public Long delete(Long id) {
        studentRepository.deleteById(id);
        return id;
    }

    @Override
    public List<StudentResponseDto> getname(String name) {
        return studentMapper.entityToListDto(studentRepository.getname(name));
    }

    @Override
    public List<JoinDto>  leftJoin() {
        List<Object[]> obj = studentRepository.leftJoin();

//        return obj.stream().map( row -> new JoinDto((String) row[0],(String) row[1],(String) row[2])).toList() ;
        return null;
    }

    @Override
    public List<JoinDto> rightJoin() {
        return studentRepository.rightJoin();
    }

    @Override
    public List<JoinDto> innerJoin() {
        return studentRepository.innerJoin();
    }

    @Override
    public List<JoinDto> fullJoin() {
        return studentRepository.fullJoin();
    }
}
