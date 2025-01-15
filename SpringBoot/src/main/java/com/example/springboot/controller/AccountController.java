package com.example.springboot.controller;

import com.example.springboot.dao.repository.AccountRepository;
import com.example.springboot.dto.AccountRequestDto;
import com.example.springboot.service.AccountService;
import lombok.RequiredArgsConstructor;
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
}
