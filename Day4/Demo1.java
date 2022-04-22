package com.revature.Day4;

public class Demo1 {
    public static void main(String[] args) {
        Output out = new Output();

        out.addNumber(200, 100);
        out.sumNumber(200, 100);
        out.mulNumber(200, 100);
        out.divNumber(200, 100);
    }
}

// Must be an abstract class to have abstract methods
abstract class Calculator {
    // Non-abstract or regular methods
    public void addNumber(int num1, int num2){
        System.out.println("Sum: " + (num1 + num2));
    }

    public void sumNumber(int num1, int num2){
        System.out.println("Sub: " + (num1 - num2));
    }

    // Abstract methods
    // Needs to not have a body or implementation
    public abstract void mulNumber(int num1, int num2);

    public abstract void divNumber(int num1, int num2);
}

class Output extends Calculator{

    // Classes extending from abstract classes must implement abstract methods from the super class
    @Override
    public void mulNumber(int num1, int num2) {
        System.out.println("Mul: " + (num1 * num2));
    }

    @Override
    public void divNumber(int num1, int num2) {
        System.out.println("Div: " + ((double) num1/ num2));
    }
}
