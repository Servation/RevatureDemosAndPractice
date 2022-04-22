package com.revature.Day4;

public class Demo7 {
    public static void main(String[] args) {

    }
}

interface I1{
    void print();
}

interface I2 extends I1{
    void display();
}

class Output3 implements I2{

    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void display() {
        System.out.println("Displaying something...");
    }
}

//class Out implements I1, I2{
//
//    @Override
//    public void print() {
//        System.out.println("Printing...");
//    }
//
//    @Override
//    public void display() {
//        System.out.println("Displaying something...");
//    }
//}
