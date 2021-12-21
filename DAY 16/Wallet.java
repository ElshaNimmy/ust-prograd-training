import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MoneyConverter {
    private double balAmount = 0;

    public double converter(double amount, String toAmount) {
        if(amount<0){
            throw new IllegalArgumentException("Amount can't less than or equal to zero");
        }
        switch (toAmount) {
            case "INR":
                return amount * 74.85;
            case "USD":
                return amount / 74.85;
            default:
                throw new IllegalArgumentException("preferred currency is not valid");
        }
    }

    public double depositAmount(double amount, String toAmount) {
        switch (toAmount) {
            case "INR":
                this.balAmount = this.balAmount + converter(amount,"INR");
                return balAmount;
            case "USD":
                this.balAmount = this.balAmount + converter(amount,"USD");
                return balAmount;
        }
        return 0;
    }

    public double withdrawAmount(double amount) {
        if(balAmount<amount){
            throw new IllegalArgumentException("No Sufficient balance");
        }
        return  balAmount - amount;
    }

    public double getBalAmount(){
        return balAmount;
    }
}
