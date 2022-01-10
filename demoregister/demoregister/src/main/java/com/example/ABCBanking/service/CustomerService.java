package com.example.ABCBanking.service;


import com.example.ABCBanking.entity.Account;
import com.example.ABCBanking.entity.Customer;
import com.example.ABCBanking.repository.AccountRepository;
import com.example.ABCBanking.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;


    public Customer saveCustomer(Customer customer){return customerRepository.save(customer);}

    public Customer findCustomerByEmail(String email){

        return customerRepository.findByEmail(email);
    }






//    public Account getAccountByCustomerId(Customer customer) {
//        return customerRepository.save(customer);
//    }
//   public Customer getAccountByCustomerId(defaultCustomer){

    //}

}
