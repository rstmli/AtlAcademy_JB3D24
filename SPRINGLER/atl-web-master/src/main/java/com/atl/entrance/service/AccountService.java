package com.atl.entrance.service;

import com.atl.entrance.dao.entity.AccountEntity;
import com.atl.entrance.dao.repository.AccountRepository;
import com.atl.entrance.dto.AccountRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {
  private  final AccountRepository accountRepository;

  public void addAccount(AccountRequestDto dto){
    AccountEntity entity = AccountEntity.builder()
        .balance(dto.getBalance())
        .accountNumber(dto.getAccountNumber())
        .build();

    accountRepository.save(entity);
  }
}
