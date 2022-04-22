package com.revature.Day1;

public class Demo8 {
    public static void main(String[] args) {
        int age = 20;

        String result = age > 18 ? "pass" : "no pass";

        System.out.println(result);

        int number = 5;
        String output = number % 2 == 0 ? "even" : "odd";
        System.out.println(output);
    }
}
