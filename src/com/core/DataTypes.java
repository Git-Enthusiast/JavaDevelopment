package com.core;

public class DataTypes {

    // Primitive Data Types
    byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;

    static void main(String[] args) {
        System.out.println("Data Types in Java:");
        System.out.println("Default values of primitive data types:");
        DataTypes dt = new DataTypes();
        System.out.println("byte: " + dt.byteVar);
        System.out.println("short: " + dt.shortVar);
        System.out.println("int: " + dt.intVar);
        System.out.println("long: " + dt.longVar);
        System.out.println("float: " + dt.floatVar);
        System.out.println("double: " + dt.doubleVar);
        System.out.println("char: '" + dt.charVar + "'");
        System.out.println("boolean: " + dt.booleanVar);

    }
}
