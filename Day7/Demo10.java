package com.revature.Day7;

// StackOverFlowError

public class Demo10 {
    public static void main(String[] args) {
       // StackOverflow
        // print1();

        try {
            print1();
        } catch (StackOverflowError ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void print1(){
        print2();
    }

    public static void print2(){
        print1();
    }
}
