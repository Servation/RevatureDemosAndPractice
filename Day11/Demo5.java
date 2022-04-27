package com.revature.Day11;

public class Demo5 {
    public static void main(String[] args) {
        final String resource1 = "first resource";
        final String resource2 = "second resource";

        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println("thread 1: locked resource 1");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource2) {
                        System.out.println("thread 1: locked resource 2");
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                synchronized (resource2) {
                    System.out.println("thread 2: locked resource 2");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource1) {
                        System.out.println("thread 2: locked resource 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}


