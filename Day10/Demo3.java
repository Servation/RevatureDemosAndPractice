package com.revature.Day10;

public class Demo3 {
    public static void main(String[] args) {
        ThreadSleepDemo t1 = new ThreadSleepDemo();
        ThreadSleepDemo t2 = new ThreadSleepDemo();
        t1.start();
        t2.start();
    }
}

class ThreadSleepDemo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
