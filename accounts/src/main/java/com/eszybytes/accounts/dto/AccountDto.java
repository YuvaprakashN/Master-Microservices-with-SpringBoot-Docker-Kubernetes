package com.eszybytes.accounts.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {


    private Long accountNumber;

    private String accountType;

    private String branchAddress;

}
