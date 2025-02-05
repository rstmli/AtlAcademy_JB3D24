package az.maybank.libraf.mapper;

import az.maybank.libraf.dao.entity.LibrafEntity;
import az.maybank.libraf.dto.LibrafResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class LibrafMapper {

    public List<LibrafResponseDto> getAll(List<LibrafEntity> entities){

        var dtos = new ArrayList<LibrafResponseDto>();

        for(LibrafEntity e : entities){
            dtos.add(
                    LibrafResponseDto.builder().name(e.getName()).author(e.getAuthor()).stock(e.getStock()).price(e.getPrice()).build()
            );
        }

        return dtos;
    }


}
