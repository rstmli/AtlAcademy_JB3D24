package az.maybank.goycayparfumary.service;

import az.maybank.goycayparfumary.dto.ParfumRequestDto;
import az.maybank.goycayparfumary.dto.ParfumResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ParfumService {
    ResponseEntity<Void> addParfum(ParfumRequestDto dto);
    List<ParfumResponseDto> getAll();
    ParfumResponseDto getById(Long id);
    ParfumResponseDto deleteParfum(Long id);
}
