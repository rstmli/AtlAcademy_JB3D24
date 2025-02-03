package tr.student.ogrencikayit.mapper;

import org.springframework.stereotype.Component;
import tr.student.ogrencikayit.dao.entity.OgrenciEntity;
import tr.student.ogrencikayit.dto.OgrenciResponseDto;

import java.util.ArrayList;
import java.util.List;

@Component
public class OgrenciMapper {

    public List<OgrenciResponseDto> entityListToDto(List<OgrenciEntity> entities){

        List<OgrenciResponseDto> dtos = new ArrayList<>();

        for(OgrenciEntity e : entities){
            OgrenciResponseDto dto = OgrenciResponseDto.builder().name(e.getName()).surname(e.getSurname()).gender(e.getGender()).build();
            dtos.add(dto);
        }
        return dtos;
    }

    public OgrenciResponseDto entityToDto(OgrenciEntity e){
        var dto = OgrenciResponseDto.builder().name(e.getName()).surname(e.getSurname()).gender(e.getGender()).build();
        return dto;
    }

}
