package com.plurasight;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("please enter deposit amount: ");
        double principal = keyboard.nextDouble();
        System.out.println("Please enter interest rate: ");
        double interestRate = keyboard.nextDouble();
        System.out.println("Please enter number of years for CD: ");
        int termInYears = keyboard.nextInt();

        double interestRateDecimal = interestRate / 100;

        double compoundInterest = principal * (Math.pow(1 + interestRateDecimal/ 365, 365 * termInYears));

        System.out.printf("If you deposit $%.2f in a CD that earns %.2f%% and matures in %d years, your CD's ending balance will be $%.2f. ",principal, interestRate,termInYears, compoundInterest);


    }
}
