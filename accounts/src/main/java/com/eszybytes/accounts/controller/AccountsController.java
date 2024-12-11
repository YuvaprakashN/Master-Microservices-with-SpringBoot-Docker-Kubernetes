package com.eszybytes.accounts.controller;

import com.eszybytes.accounts.dto.ResponseDto;
import com.eszybytes.accounts.service.IAccountService;
import com.eszybytes.accounts.service.ICustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AccountsController {

private IAccountService accountService;
private ICustomerService customerService;



}
