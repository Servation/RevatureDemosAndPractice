package com.revature.Day2;

public class Demo9 {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        calculation.addNumber();
        Calculation calculation1 = new Calculation(200, 100);
        calculation1.addNumber();
    }
}

class Calculation {
    int a = 20;
    int b = 10;

    public Calculation() {
        System.out.println("parameter less constructor");
    }

    public Calculation(int x, int y) {
        System.out.println("parameterized constructor");
        this.a = x;
        this.b = y;
    }

    public void addNumber() {
        System.out.println("Sum: " + (a + b));
    }
}
