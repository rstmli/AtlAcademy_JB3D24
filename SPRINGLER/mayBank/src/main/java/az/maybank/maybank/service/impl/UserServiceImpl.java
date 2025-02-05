package az.maybank.maybank.service.impl;

import az.maybank.maybank.dao.entity.BankEntity;
import az.maybank.maybank.dao.entity.UserEntity;
import az.maybank.maybank.dao.repository.BankRepository;
import az.maybank.maybank.dao.repository.UsersRepository;
import az.maybank.maybank.dto.UserRequestDto;
import az.maybank.maybank.mapper.UserMapper;
import az.maybank.maybank.service.UserService;
import az.maybank.maybank.util.exception.BankNotFoundException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    private final UserMapper userMapper;
    private final UsersRepository usersRepository;
    private final BankRepository bankRepository;


    @Override
    public void addUsers(UserRequestDto dto) {
        BankEntity bank = bankRepository.findById(dto.getBankId()).orElseThrow(() -> new BankNotFoundException("Not found bank"));
        usersRepository.save(UserEntity.builder().name(dto.getName()).surname(dto.getSurname()).bankEntity(bank).build());

    }
}
