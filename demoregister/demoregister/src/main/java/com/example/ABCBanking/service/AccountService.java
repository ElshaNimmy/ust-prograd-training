package com.example.ABCBanking.service;

import com.example.ABCBanking.entity.Account;
import com.example.ABCBanking.entity.Customer;
import com.example.ABCBanking.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    public Account saveAccount(Account account){
        return accountRepository.save(account);
    }

    public Account getAccountByCustomerId(Customer customer) {
        return accountRepository.findAccountByCustomerId(customer);
    }


    public Account getAccountByAccountId(Long accountNumber) {
        return accountRepository.findAccountByAccountId(accountNumber);
    }
}
