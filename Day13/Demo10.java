package com.revature.Day13;

public class Demo10 {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.print();
        obj.draw();
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {

    }
}

class Circle implements Drawable {
    @Override
    public void draw() {

    }

    @Override
    public void print() { // optional implementation
        Drawable.super.print();
    }
}

interface Drawable {
    void draw();

    default void print(){
        System.out.println("print...");
    }
}
