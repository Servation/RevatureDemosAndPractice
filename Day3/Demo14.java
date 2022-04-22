package com.revature.Day3;

public class Demo14 {
    public static void main(String[] args) {
        Calculation.test();
        Calculation.test(1);
        Calculation.test("");
        Calculation.test(1, "aString");
    }
}

class Calculation {
    public static void test() {
        System.out.println("1st Method");
    }

    public static void test(int a) {
        System.out.println("2nd Method");
    }

    public static void test(String a) {
        System.out.println("3rd Method");
    }

    public static void test(int a, String b) {
        System.out.println("4th Method");
    }

}
