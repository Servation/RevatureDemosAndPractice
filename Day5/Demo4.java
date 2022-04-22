package com.revature.Day5;

public class Demo4 {
    public static void main(String[] args) {
        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = new String("Mark");

        System.out.println(s1 == s2); // true because both refers to the same instance
        System.out.println(s1 == s3); // false because s3 refers to the instance created in normal heap
    }
}
