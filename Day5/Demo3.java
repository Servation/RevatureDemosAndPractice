package com.revature.Day5;

public class Demo3 {
    public static void main(String[] args) {
        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = new String("Mark");
        String s4 = "Paul";
        System.out.println("Using equals method between s1 and s3: " + s1.equals(s2));
        System.out.println("Using equals method between s1 and s3: " + s1.equals(s3)); //checks each char on each index
        System.out.println("Using == between s1 and s2: " + (s1 == s2)); // Checks the if the reference to the objects s1 and s2 are the same
        System.out.println("Using == between s1 and s3: " + (s1 == s3));
        System.out.println("Using the compareTo method between s1 and s3: " + s1.compareTo(s3)); //compares based on unicode of each character in the string

        String s5 = "MARK";
        System.out.println(s1.equals(s5)); // false
        System.out.println(s5.equalsIgnoreCase(s1)); // true
    }
}
