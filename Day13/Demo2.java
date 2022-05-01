package com.revature.Day13;

public class Demo2 {
    public static void main(String[] args) {
        ISayHello hi = () -> "Hello World";
        String result = hi.hello();
        System.out.println(result);

        ISayHello2 hey = (name) -> "Welcome " + name;
        System.out.println(hey.hello("Mark"));

        ICalculator adder = Integer::sum;
        System.out.println(adder.addNumber(100, 200));
    }
}

interface ISayHello {
    String hello();
}

interface ISayHello2 {
    String hello(String name);
}

interface ICalculator {
    int addNumber(int a, int b);
}
