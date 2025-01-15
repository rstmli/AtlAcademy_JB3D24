package com.example.springboot.service;

import com.example.springboot.dao.entity.AccountEntity;
import com.example.springboot.dao.repository.AccountRepository;
import com.example.springboot.dto.AccountRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;
    public void addAccount(AccountRequestDto dto){
    AccountEntity entity = AccountEntity.builder()
            .balance(dto.getBalance())
            .accountNumber(dto.getAccountNumber())
            .build();
    accountRepository.save(entity);

    }
}
