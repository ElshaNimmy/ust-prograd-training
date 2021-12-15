package com.company;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CurrencyConverter {

    public static void main(String[] args) throws IOException {
        Currency currency = new Currency();
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger("MyLog");
        FileHandler file;
        file = new FileHandler("log.txt");
        logger.addHandler(file);
        SimpleFormatter formatter = new SimpleFormatter();
        file.setFormatter(formatter);
        logger.info("Program Started...");
        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("1.Rupees to Dollars");
            System.out.println("2.Dollars to Rupees");
            System.out.println("3.Rupees to Yuan");
            System.out.println("4.Yuan to Rupees");
            System.out.println("5.Rupees to Canadian Dollar");
            System.out.println("6.Canadian Dollar to Rupees");

            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.println("Enter Amount in Rupees");
                logger.info("user choosed to convert Rupees to Dollars");
                double Rupees = sc.nextDouble();
               if (Rupees < 0)
               {
                  throw new IllegalArgumentException("amount cannot be negative");
              }
              else
                System.out.printf("%.2f", currency.rupeesToDollar(Rupees));
            }
            if (choice == 2) {
                System.out.println("Enter Amount in Dollars");
                double Dollar = sc.nextInt();
                logger.info("user choosed to convert Dollars to Rupees");
                if (Dollar < 0) {
                    throw new IllegalArgumentException("Amount is invalid");
                } else
                    System.out.printf("%.2f", currency.dollarToRupees(Dollar));
            }
            if (choice == 3) {
                System.out.println("Enter Amount in Rupees");
                double Rupees = sc.nextInt();
                logger.info("user choosed to convert Rupees to Yuan");
                if (Rupees < 0)
                    throw new IllegalArgumentException("Amount is invalid");
                else
                    System.out.printf("%.2f", currency.rupeesToYuan(Rupees));
            }
            if (choice == 4) {
                System.out.println("Enter Amount in Yuan");
                double Yuan = sc.nextInt();
                logger.info("user choosed to convert Yuan to Rupees");
                if (Yuan < 0)
                    throw new IllegalArgumentException("Amount is invalid");
                else
                    System.out.printf("%.2f", currency.yuanToRupess(Yuan));
            }
            if (choice == 5) {
                System.out.println("Enter Amount in Rupees to convert it to CAD");
                double Rupees = sc.nextInt();
                logger.info("user choosed to convert Rupees to CAD");
                if (Rupees < 0)
                    throw new IllegalArgumentException("Amount is invalid");
                else
                    System.out.printf("%.2f", currency.rupeesToCanadianDollar(Rupees));
            }
            if (choice == 6) {
                System.out.println("Enter Amount in CAD");
                double amountInCAD = sc.nextInt();
                logger.info("user choosed to convert CAD Rupees");
                if (amountInCAD < 0)
                    throw new IllegalArgumentException("Amount is invalid");
                else
                    System.out.printf("%.2f", currency.canadianDollarToRupees(amountInCAD));
            }

            logger.info("Program Stopped");
        }
    }
}