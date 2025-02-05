package az.maybank.maybank.service;

import az.maybank.maybank.dto.BankResponseDto;
import az.maybank.maybank.dto.UserRequestDto;

import java.util.List;

public interface BankService {
    List<BankResponseDto> getall();
    BankResponseDto getById(Long id);

}
