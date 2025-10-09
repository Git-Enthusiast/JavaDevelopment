package com.core.Basics;

import java.util.Scanner;

public class TemperatureConversion {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Temperature in degree Celsius: ");
        float tempC = input.nextFloat();
        double tempF = ((tempC * ((double) 9 / 5) + 32));
        System.out.println("The Temperature in degree Fahrenheit is : " + tempF);
        input.close();
    }
}
