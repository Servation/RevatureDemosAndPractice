package com.revature.Day7;

public class Demo1 {
    public static void main(String[] args) {
        int a = 40;
        int b = 0;
        int c = a /b; // Throws ArithmeticException because trying to divide by zero
        System.out.println(c);
    }
}
