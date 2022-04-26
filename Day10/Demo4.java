package com.revature.Day10;

public class Demo4 {
    public static void main(String[] args) {
        TestCallRun t1 = new TestCallRun();
        TestCallRun t2 = new TestCallRun();

//        t1.start();
//        t2.start();

        t1.run(); // calls normal class method run() and not a thread class object
        t2.run();
    }
}

class TestCallRun extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}