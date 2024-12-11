package com.eszybytes.accounts.dto;


import lombok.*;

@Data
@AllArgsConstructor
public class CustomerDto {

    private String name;
    private String email;
    private String mobileNumber;

    private  AccountDto accountDto;
}
