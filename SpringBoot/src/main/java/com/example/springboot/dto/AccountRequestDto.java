package com.example.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountRequestDto {
    private String accountNumber;
    private BigDecimal balance;
}
