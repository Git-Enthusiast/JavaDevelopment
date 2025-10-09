package com.core.Loops_Switch;

import java.util.Scanner;

public class CaseCheck {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter an Alphabet to check weather it is in UpperCase or LowerCase: ");
        char alphabet = input.next().trim().charAt(0);
        if (alphabet >= 'a' && alphabet <= 'z') {
            System.out.println("The Alphabet " + alphabet + " is in LowerCase.");
        } else if (alphabet >= 'A' && alphabet <= 'Z') {
            System.out.println("The Alphabet " + alphabet + " is in UpperCase.");
        } else System.out.println("Invalid Input! Please Enter a valid English Alphabet.");

    }
}
