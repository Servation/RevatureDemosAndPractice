package com.revature.Day10;

public class Demo1 {
    public static void main(String[] args) {
        ThreadClassDemo thread = new ThreadClassDemo();
        thread.start(); // starts thread
    }
}

class ThreadClassDemo extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}
