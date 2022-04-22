package com.revature.Day3;

public class Demo8 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // non-static method
        calculator.addNumber(100, 20);

        // static method
        Calculator.subtractNumber(291, 31);
    }
}

class Calculator {
    // non-static method
    public void addNumber(int a, int b){
        System.out.println(a+ b);
    }

    // static method
    public static void subtractNumber(int a, int b){
        System.out.println(a - b);
    }
}
