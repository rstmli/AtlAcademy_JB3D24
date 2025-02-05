package az.maybank.alivenino.mapper;

import az.maybank.alivenino.dao.entity.AliveninoEntity;
import az.maybank.alivenino.dto.AliveninoResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class AliveninoMapper {

    public List<AliveninoResponseDto> entityListToDto(List<AliveninoEntity> entities){
        var dtos = new ArrayList<AliveninoResponseDto>();
        for(AliveninoEntity e : entities){
            dtos.add(
                    AliveninoResponseDto.builder().name(e.getName()).price(e.getPrice()).stock(e.getStock()).build()
            );
        }
        return dtos;
    }


}
