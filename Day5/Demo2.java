package com.revature.Day5;

public class Demo2 {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat("World"); // using concat() method to append the string at the end
        System.out.println(str); // will print Hello because strings are immutable

        String str1 = "Hello";
        str1 = str1.concat(" World"); // creates a new String "Hello World" and points str1 to a reference to that string
        System.out.println(str1);
    }
}
