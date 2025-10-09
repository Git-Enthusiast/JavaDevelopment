package com.core.Loops_Switch;

import java.util.Scanner;

public class CountDigit {
    /*
    Count Digits using Logarithms:
    int count = (int) Math.log10(Math.abs(num)) + 1;

     */
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a Number to count its Digit.");
        int num = input.nextInt();
        if (num == 0) {
            System.out.println("The No. of Digits in the Number 0 = 1");
        } else {
            int temp = Math.abs(num);
            int count = 0;
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
            System.out.println("The No. of Digits in the Number " + num + " = " + count);
        }
        input.close();
    }
}
