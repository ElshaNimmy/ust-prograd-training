package com.example.ABCBanking.repository;

import com.example.ABCBanking.entity.Account;
import com.example.ABCBanking.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<Account,String> {
    @Query("Select account from Account account where account.customer=:customer")
    Account findAccountByCustomerId(Customer customer);

    @Query("Select account from Account account where account.accountNumber=:accountNumber")
    Account findAccountByAccountId(Long accountNumber);
}
