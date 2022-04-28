package com.revature.Day12;

public class Demo5 {
    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        boolean result = calculator.areEqual("A", "A");
        Calculator<String> calculator = new Calculator<>();
//        calculator.areEqual("A", 10); // Error
        boolean result = calculator.areEqual("A", "A");
        if (result) {
            System.out.println("are equal");
        } else {
            System.out.println("not equal");
        }
    }
}

class Calculator<T> {
//    public boolean areEqual(int a, int b) {
//        return a == b;
//    }

    //    public boolean areEqual(Object a, Object b) { // Can compare with anything and not type safe
//        return a.equals(b);
//    }
    public boolean areEqual(T a, T b) {
        return a.equals(b);
    }
}
