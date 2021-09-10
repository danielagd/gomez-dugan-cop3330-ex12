package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */
public class SimpleInterest
{
    public static void main( String[] args )
    {
        // Program to calculate
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble() / 100.0;

        System.out.print("Enter the number of years: ");
        int num_years = input.nextInt();

        double interest = createSimpleInterest(principal, rate, num_years);
        String str = "%";

        System.out.printf("After %d years, at %.2f%s, the investment will be worth $%.2f.", num_years, (rate * 100), str, interest);

    }

    // Calculation of simple interest
    private static double createSimpleInterest(double principal, double rate, double num_years)
    {
        return principal * (1 + (rate * num_years));
    }
}
