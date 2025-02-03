package az.student.studentapp.mapper;

import az.student.studentapp.dao.entity.StudentEntity;
import az.student.studentapp.dto.StudentRequestDto;
import az.student.studentapp.dto.StudentResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
@Data
public class StudentMapper {

    public List<StudentResponseDto> entityToListDto(List<StudentEntity> entities){
        List<StudentResponseDto> dtos = new ArrayList<>();

        for(StudentEntity e : entities){
            var dto = StudentResponseDto.builder().name(e.getName()).surname(e.getSurname()).gender(e.getGender()).build();
            dtos.add(dto);
        }
        return dtos;
    }

    public StudentResponseDto entityToDto(StudentEntity e){
        List<StudentResponseDto> dtos = new ArrayList<>();


        var dto = StudentResponseDto.builder().id(e.getId()).name(e.getName()).surname(e.getSurname()).gender(e.getGender()).build();


        return dto;
    }
}
