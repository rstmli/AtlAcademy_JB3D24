package az.student.studentapp.service.impl;

import az.student.studentapp.dao.entity.StudentEntity;
import az.student.studentapp.dao.repository.StudentRepository;
import az.student.studentapp.dto.StudentRequestDto;
import az.student.studentapp.dto.StudentResponseDto;
import az.student.studentapp.mapper.StudentMapper;
import az.student.studentapp.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public void postStudent(StudentRequestDto dto) {
        var entity = StudentEntity.builder().name(dto.getName()).surname(dto.getSurname()).gender(dto.getGender()).build();
        studentRepository.save(entity);
    }

    @Override
    public List<StudentResponseDto> getALl() {
        var entity  = studentRepository.findAll();
        return studentMapper.entityToListDto(entity);
    }

    @Override
    public Long update(Long id, StudentRequestDto dto) {
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
    public Long delete(Long id) {
        studentRepository.deleteById(id);
        return id;
    }

    @Override
    public List<StudentResponseDto> getnaem(String name) {
        return studentMapper.entityToListDto(studentRepository.getname(name));
    }
}
