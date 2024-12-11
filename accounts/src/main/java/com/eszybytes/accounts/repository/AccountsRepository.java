package com.eszybytes.accounts.repository;

import com.eszybytes.accounts.entity.Accounts;
import com.eszybytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts,Integer> {
}
