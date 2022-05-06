package com.revature.Day11;

public class Demo2 {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread(new MyThread1(table));
        MyThread2 t2 = new MyThread2(table);

        t1.start();
        t2.start();
    }
}

// with synchronization
class Table {
    public synchronized void printTable(int number) { // synchronized
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class MyThread1 implements Runnable {
    Table table;

    public MyThread1(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table table;

    public MyThread2(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(500);
    }
}

// without synchronization
//class Table {
//    public void printTable(int number) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(number + " x " + i + " = " + number * i);
//        }
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
//}



