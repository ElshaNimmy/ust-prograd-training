package com.company;
public class CurrencyExchange {
    public double rupeesToDollar(double moneyInRupees) {
        return moneyInRupees / 74.85;
    }

    public double dollarToRupees(double moneyInDollar) {
        return moneyInDollar * 74.85;
    }

    public double rupeesToYuan(double moneyInRupees) {
        return moneyInRupees * 11.99;
    }

    public double yuanToRupees(double moneyInYuan) {
        return moneyInYuan / 11.99;
    }

    public double rupeesToCanadianDollar(double moneyInRupees) {
        return moneyInRupees * 59.18;
    }

    public double canadianDollarToRupees(double moneyInCanadianDollar) {
        return moneyInCanadianDollar / 59.18;
    }
}

