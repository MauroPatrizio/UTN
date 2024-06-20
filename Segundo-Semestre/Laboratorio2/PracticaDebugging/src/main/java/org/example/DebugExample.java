package org.example;

public class DebugExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int addResult = add(a,b);
        System.out.println("Add Result: " + addResult);
        int multiplyResult = multiply(a,b);
        System.out.println("Multiply Result: " + multiplyResult);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
