package com.revature.Day4;

public class Demo11 {
    public static void main(String[] args) {

    }
}

interface X2{
    void print();

    interface Y2{
        void display();

        interface Z2{
            void foo();
        }
    }
}

class Output5 implements X2, X2.Y2, X2.Y2.Z2{
    // implements X2 print method
    @Override
    public void print() {

    }
    // implements X2.Y2 display method
    @Override
    public void display() {

    }
    // implements X2.Y2.Z2 foo method
    @Override
    public void foo() {

    }
}
