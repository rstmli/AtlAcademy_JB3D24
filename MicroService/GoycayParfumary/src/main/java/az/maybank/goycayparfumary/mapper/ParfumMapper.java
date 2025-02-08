package az.maybank.goycayparfumary.mapper;

import az.maybank.goycayparfumary.dao.entity.ParfumEntity;
import az.maybank.goycayparfumary.dto.ParfumResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ParfumMapper {

    List<ParfumResponseDto> getALl(List<ParfumEntity> entityLIst);
    ParfumResponseDto getById(ParfumEntity e);
}
