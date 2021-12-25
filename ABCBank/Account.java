package task.ABCBank;

import org.springframework.stereotype.Component;
@Component
public class Account {
    double balanceAmount=1000;
    public double getBalanceCustomer() {
        return balanceAmount;
    }
}