package az.maybank.libraf.service;

import az.maybank.libraf.dto.LibrafResponseDto;

import java.util.List;

public interface LibrafService {
    List<LibrafResponseDto> getAll();
}
