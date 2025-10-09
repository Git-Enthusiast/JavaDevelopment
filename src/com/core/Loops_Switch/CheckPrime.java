package com.core.Loops_Switch;

import java.util.Scanner;

public class CheckPrime {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer to check whether it's prime or not: ");
        long num = input.nextLong();

        if (num <= 1) {
            System.out.println("The number " + num + " is not a prime number.");
        } else {
            boolean isPrime = true;
            for (long i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("The number " + num + " is a prime number.");
            } else {
                System.out.println("The number " + num + " is not a prime number.");
            }
        }

        input.close();
    }
}
