package com.atl.entrance.controller;



import com.atl.entrance.dao.entity.AccountEntity;
import com.atl.entrance.dao.repository.AccountRepository;
import com.atl.entrance.dto.AccountRequestDto;
import com.atl.entrance.service.AccountService;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/account")
public class AccountController {
  private final AccountService accountService;
  private final AccountRepository accountRepository;

  @PostMapping
  public void addAccount(@RequestBody AccountRequestDto dto){
      accountService.addAccount(dto);
  }


  @GetMapping
  public List<AccountEntity> getAccounts(){
    return accountRepository.findAll();
  }

  @GetMapping("{id}")
  public AccountEntity getAccount(@PathVariable("id") Long id){
    return accountRepository.findById(id).get();
  }
}
