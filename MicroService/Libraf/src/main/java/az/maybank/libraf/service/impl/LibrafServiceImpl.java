package az.maybank.libraf.service.impl;

import az.maybank.libraf.dao.repository.LibrafRepository;
import az.maybank.libraf.dto.LibrafResponseDto;
import az.maybank.libraf.mapper.LibrafMapper;
import az.maybank.libraf.service.LibrafService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LibrafServiceImpl implements LibrafService {
    private final LibrafMapper userMapper;
    private final LibrafRepository librafRepository;


    @Override
    public List<LibrafResponseDto> getAll() {
        return userMapper.getAll(librafRepository.findAll());
    }
}
