package az.maybank.maybank.service.impl;

import az.maybank.maybank.dao.entity.BankEntity;
import az.maybank.maybank.dao.entity.UserEntity;
import az.maybank.maybank.dao.repository.BankRepository;
import az.maybank.maybank.dao.repository.UsersRepository;
import az.maybank.maybank.dto.BankResponseDto;
import az.maybank.maybank.dto.UserRequestDto;
import az.maybank.maybank.mapper.BankMapper;
import az.maybank.maybank.service.BankService;
import az.maybank.maybank.util.exception.BankNotFoundException;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Data
public class BankServiceImpl implements BankService {
    private final BankRepository bankRepository;
    private final UsersRepository usersRepository;
    private final BankMapper bankMapper;


    @Override
    public List<BankResponseDto> getall() {
        return bankMapper.entityListToDto(bankRepository.findAll());
    }

    @Override
    public BankResponseDto getById(Long id) {
        return bankMapper.entityToDto(id);
    }


}
