package az.maybank.goycayparfumary.service.impl;

import az.maybank.goycayparfumary.dao.entity.ParfumEntity;
import az.maybank.goycayparfumary.dao.repository.ParfumRepository;
import az.maybank.goycayparfumary.dto.ParfumRequestDto;
import az.maybank.goycayparfumary.dto.ParfumResponseDto;
import az.maybank.goycayparfumary.mapper.ParfumMapper;
import az.maybank.goycayparfumary.service.ParfumService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ParfumServiceImpl implements ParfumService {
    private final ParfumRepository repository;
    private final ParfumMapper mapper;
    @Override
    public ResponseEntity<Void> addParfum(ParfumRequestDto dto) {
        ParfumEntity entity = ParfumEntity.builder().name(dto.getName()).paket(dto.getPaket()).price(dto.getPrice()).stock(dto.getStock()).qram(dto.getQram()).build();
        repository.save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    public List<ParfumResponseDto> getAll() {
       var entity =  repository.findAll();
        return mapper.getALl(entity);
    }

    @Override
    public ParfumResponseDto getById(Long id)throws RuntimeException {
        ParfumEntity entity = repository.findById(id).orElseThrow(() -> new RuntimeException("not found parfum"));
        return mapper.getById(entity);
    }

    @Override
    public ParfumResponseDto deleteParfum(Long id)throws RuntimeException {
        var parfum = repository.findById(id).orElseThrow(()-> new RuntimeException("not found Parfume id"));
        repository.delete(parfum);
        return mapper.getById(parfum);
    }

}
