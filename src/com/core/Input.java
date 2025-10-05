package com.core;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please Enter Your Name:");
            String name = input.nextLine();
            System.out.println("Please Enter Your Roll No:");
            int rollNo = input.nextInt();
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);

        }
    }
}