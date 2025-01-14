package com.example.springboot.controller;

import com.example.springboot.dao.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/account")
public class AccountController {
    private final AccountController accountController;
    private final AccountRepository accountRepository;

    @PostMapping
    public void addAccount(@RequestBody AccountRequest)
}
