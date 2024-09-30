package com.plurasight;
import java.util.Scanner;

public class MortgageCalculator {


    public static void main(String[] args) {
        // Set Constants that won't change
        final int MONTH_IN_YEARS = 12;
        final int PERCENT = 100;

        Scanner keyboard = new Scanner(System.in);
        // Ask user for input
        System.out.print("Enter the principal amount: ");
        double principal = keyboard.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        float annualInterestRate = keyboard.nextFloat();

        System.out.print("Enter the loan term (years): ");
        int loanTermYears = keyboard.nextInt();
        keyboard.nextLine();

        float monthlyInterestRate = annualInterestRate / PERCENT/ MONTH_IN_YEARS;

        int numberOfPayments = loanTermYears * MONTH_IN_YEARS;

        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);


        double  totalInterestPaid = 0;
        double loanBalance = principal;

        for (int month = 1; month <= numberOfPayments; month++ ){
            double interest = loanBalance * monthlyInterestRate;
            principal = mortgage -interest;

            totalInterestPaid +=interest;
            loanBalance -=principal;
        }

        System.out.printf("Monthly Payment: $%.2f \n",mortgage);
        System.out.printf("Loan balance: %.2f total interest paid: %.2f", loanBalance, totalInterestPaid);
//        System.out.println(monthlyInterestRate);



    }
}
