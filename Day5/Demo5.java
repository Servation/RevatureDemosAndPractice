package com.revature.Day5;

public class Demo5 {
    public static void main(String[] args) {
        // compareTo() method returns a positive number, negative number or 0
        // if s1 > s2 return positive number
        // if s1 < s2 returns negative number
        // if s1 == s2 returns 0
        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = "Paul";

        System.out.println(s1.compareTo(s2)); // prints 0 because both are equal
        System.out.println(s1.compareTo(s3)); // prints -3 because m is 3 less than p
        System.out.println(s3.compareTo(s1)); // prints 3 because p is 3 more than m
    }
}
