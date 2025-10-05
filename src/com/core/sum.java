package com.core;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int num1;
        int num2;
        System.out.println("Please Enter two integer:");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("The Sum of the Given number is : "+sum);
        input.close();

    }

}
