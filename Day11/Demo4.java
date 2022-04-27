package com.revature.Day11;

public class Demo4 {
    public static void main(String[] args) {
        Table2 table = new Table2();
        MyThread11 t1 = new MyThread11(table);
        MyThread22 t2 = new MyThread22(table);

        t1.start();
        t2.start();
    }
}

class Table2 {
    public void printTable(int number) {
        // synchronized block
        synchronized (this) {
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
}

class MyThread11 extends Thread {
    Table2 table;

    public MyThread11(Table2 table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(5);
    }
}

class MyThread22 extends Thread {
    Table2 table;

    public MyThread22(Table2 table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(500);
    }
}