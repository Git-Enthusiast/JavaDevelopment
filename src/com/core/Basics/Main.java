package com.core.Basics;

import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("Please enter your name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name);
        input.close();
    }
}
