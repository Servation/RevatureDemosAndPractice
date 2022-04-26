package com.revature.Day10;

public class Demo5 {
    public static void main(String[] args) {
        ThreadNameDemo t1 = new ThreadNameDemo();
        ThreadNameDemo t2 = new ThreadNameDemo();

        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());

        t1.start();
        t2.start();

        t1.setName("new name t1");
        t2.setName("new name t2");

        System.out.println("After changing name of t1: " + t1.getName());
        System.out.println("After changing name of t2: " + t2.getName());
    }
}

class ThreadNameDemo extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}
