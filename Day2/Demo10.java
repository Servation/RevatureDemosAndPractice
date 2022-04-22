package com.revature.Day2;

public class Demo10 {
    public static void main(String[] args) {
        Test test1 = new Test(); //1st
        Test test2 = new Test("A"); //3rd
        Test test3 = new Test("A", 10);
        Test test4 = new Test(10);
        Test test5 = new Test(10, "A");
    }
}

class Test {
    public Test() {
        System.out.println("1st constructor");
    }

    public Test(int a) {
        System.out.println("2nd constructor");
    }

    public Test(String a) {
        System.out.println("3rd constructor");
    }

    public Test(int a, String b) {
        System.out.println("4th constructor");
    }

    public Test(String a, int b) {
        System.out.println("5th constructor");
    }
}
