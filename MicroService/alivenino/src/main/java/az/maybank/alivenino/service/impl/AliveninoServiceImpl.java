package az.maybank.alivenino.service.impl;

import az.maybank.alivenino.dao.repository.AliveninoRepository;
import az.maybank.alivenino.dto.AliveninoResponseDto;
import az.maybank.alivenino.mapper.AliveninoMapper;
import az.maybank.alivenino.service.AliveninoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AliveninoServiceImpl implements AliveninoService {
    private final AliveninoMapper aliveninoMapper;
    private final AliveninoRepository aliveninoRepository;
    @Override
    public List<AliveninoResponseDto> getAll() {
        return aliveninoMapper.entityListToDto(aliveninoRepository.findAll());
    }
}
