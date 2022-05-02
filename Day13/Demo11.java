package com.revature.Day13;

public class Demo11 {
    public static void main(String[] args) {
        Circle2 obj = new Circle2();
        obj.draw();
        Drawable2.print();
    }
}

class Circle2 implements Drawable2{
    @Override
    public void draw() {

    }
}

interface Drawable2 {
    void draw();
    static void print(){ // can't be override
        System.out.println("printing...");
    }
}
