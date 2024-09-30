package com.plurasight;

import java.util.Scanner;

public class AnnuityCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your monthly payout: ");
        double monthlyPay = keyboard.nextDouble();

        System.out.print("Please enter the expected interest rate: ");
        double interestRate = keyboard.nextDouble() / 100 / 12;

        System.out.print("Please enter years to pay out: ");
        int numberPayments = keyboard.nextInt() * 12 ;


        double presentValue = monthlyPay * ((1 - Math.pow(1 + interestRate,  -numberPayments)) / interestRate);

        System.out.printf("The present value is: $%.2f", presentValue);


    }
}
