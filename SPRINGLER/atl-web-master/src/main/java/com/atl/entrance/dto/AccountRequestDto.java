package com.atl.entrance.dto;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
//@Component, @Repository, @Service - create bean
public class AccountRequestDto {
  private String accountNumber;
  private BigDecimal balance;
}
