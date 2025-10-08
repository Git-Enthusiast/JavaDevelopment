package com.core.Basics;

public class DataTypes {
    // Primitive Data Types
    byte varByte = 23; // 1 byte
    short varShort = 2323; // 2 bytes
    int varInt = 2342432; // 4 bytes
    long varLong = 234234245645634L; // 8 bytes
    float varFloat = 2343242.432f; // 4 bytes
    double varDouble = 523434234.3423423423; // 8 bytes
    boolean varBoolean = false; // 1 bit
    char varChar = 'A'; // 2 bytes

    // Derived Data Types
    String varString = "Rajan Raj";
    int[] arr = {1223, 323, 23, 7456, 533};

    public static void main(String[] args) {
        DataTypes obj = new DataTypes();
        System.out.println("Primitive Data Types");
        System.out.println("byte: " + obj.varByte);
        System.out.println("short: " + obj.varShort);
        System.out.println("int: " + obj.varInt);
        System.out.println("long: " + obj.varLong);
        System.out.println("float: " + obj.varFloat);
        System.out.println("double: " + obj.varDouble);
        System.out.println("boolean: " + obj.varBoolean);
        System.out.println("char: " + obj.varChar);

        System.out.println("Derived Data Types");
        System.out.println("String: " + obj.varString);
        for (int i = 0; i < obj.arr.length; i++) {
            System.out.println(obj.arr[i]);
        }
    }

}
