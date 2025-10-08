package com.core.Loops_Switch;

import java.util.Scanner;

public class Conditional {
    static void main() {
        // if else conditional statements
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Monthly Salary: ");
        int salary = input.nextInt();
        if (salary > 100_000) {
            System.out.println("Welcome! You are eligible for Credit Card.");
        } else System.out.println("You are Ineligible for Credit Card.");
    }
}
