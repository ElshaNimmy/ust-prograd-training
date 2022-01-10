package com.example.ABCBanking.controller;

import com.example.ABCBanking.entity.Account;
import com.example.ABCBanking.entity.Customer;
import com.example.ABCBanking.service.AccountService;
import com.example.ABCBanking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class CustomerController {
    String email;
   Double balance;
    @Autowired
    private CustomerService service;
    @Autowired
    private AccountService accountService;

    @RequestMapping("/")
    public String index() {
        return "Login";
    }

    @RequestMapping("/Register")
    public String register() {
        return "Register";
    }

    @RequestMapping("/Home")
    public String home(){
        return "Home";
    }

    @PostMapping("/Home")
    public String customerLogin(HttpServletRequest request, Model model) {
        Customer customer = service.findCustomerByEmail(request.getParameter("email"));
        if (customer.getPassword().equals(request.getParameter("password"))) {
            email = customer.getEmail();
            return "Home";
        } else {
            model.addAttribute("message", "Invalid Credientials");
            return "Login";
        }
    }


    @RequestMapping("/Profile")
    public String customerProfile(Model model) {
    Customer customer = service.findCustomerByEmail(email);
       model.addAttribute("name",customer.getName());
        model.addAttribute("email",customer.getEmail());
     model.addAttribute("phone",customer.getPhone());
      model.addAttribute("address",customer.getAddress());
      Account account= accountService.getAccountByCustomerId(customer);
      model.addAttribute("balance",account.getBalance());

        return "Profile";
    }
    @PostMapping("/Profile")
    public String ProfileUpdated(HttpServletRequest request,Model model) {

        Customer customer = service.findCustomerByEmail(email);
        customer.setName(request.getParameter("name"));
        customer.setPhone(request.getParameter("phone"));
        customer.setAddress(request.getParameter("address"));
        service.saveCustomer(customer);
        model.addAttribute("name",customer.getName());
        model.addAttribute("email",customer.getEmail());
        model.addAttribute("phone",customer.getPhone());
        model.addAttribute("address",customer.getAddress());
        Account account= accountService.getAccountByCustomerId(customer);
        model.addAttribute("balance",account.getBalance());

        return "Profile";
    }
    @RequestMapping("/UpdateProfile")
    public String updateProfile(Model model) {
        Customer customer = service.findCustomerByEmail(email);

        model.addAttribute("name", customer.getName());
        model.addAttribute("email", customer.getEmail());
        model.addAttribute("phone", customer.getPhone());
        model.addAttribute("address", customer.getAddress());

        return "UpdateProfile";
}


    @RequestMapping("/Login")
    public String login() {
        return "Login";
    }

    @PostMapping("/Login")
    public String customerRegistration(HttpServletRequest req, Model model) {
        if (!(req.getParameter("password").equals(req.getParameter("confirmPassword")))) {
            model.addAttribute("message", "password doesn't match");
            return "Register";
        }
      Customer customer = new Customer(req.getParameter("name"), req.getParameter("email"), req.getParameter("password"),req.getParameter("phone"),req.getParameter("address"));

        service.saveCustomer(customer);
        Account account =new Account(0.0, customer);
        accountService.saveAccount(account);

        customer.setAccount(account);
        service.saveCustomer(customer);
        return "Login";

    }
    @RequestMapping("/Deposit")
    public String deposit(){
        return "Deposit";
    }
    @PostMapping("/Deposit")
    public String deposited(HttpServletRequest request){
        Customer customer=service.findCustomerByEmail(email);
       Account account=accountService.getAccountByCustomerId(customer);

       balance = account.getBalance() + Double.parseDouble(request.getParameter("amount"));
       account.setBalance(balance);
       accountService.saveAccount(account);
        return "Deposit";

    }
    @RequestMapping("/Transfer")
    public String transfer(HttpServletRequest request,Model model){

        return "Transfer";
    }
    @PostMapping("/Transfer")
    public String transaction(HttpServletRequest req,Model model){
        Customer customer=service.findCustomerByEmail(email);
        Account account = accountService.getAccountByCustomerId(customer);
//        model.addAttribute("accountNumber",account.getAccountNumber());
//        Long fromaccount = Long.pa
        Double amount=Double.parseDouble(req.getParameter("amount"));
        if(account.getBalance()<amount){
            model.addAttribute("message","Balance is not sufficient!!!");
        }
        else {

            account.setBalance(account.getBalance()-amount);
            accountService.saveAccount(account);
            Account toaccount= accountService.getAccountByAccountId(Long.parseLong(req.getParameter("toaccount")));
            toaccount.setBalance(toaccount.getBalance()+amount);
            accountService.saveAccount(toaccount);
        }
        return "Transfer";
    }
}




