package com.revature.Day11;

public class Demo1 {
    public static void main(String[] args) {
        ThreadJoinDemo t1 = new ThreadJoinDemo();
        ThreadJoinDemo t2 = new ThreadJoinDemo();
        ThreadJoinDemo t3 = new ThreadJoinDemo();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}

class ThreadJoinDemo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            System.out.println(i);
        }
    }
}
