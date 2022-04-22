package com.revature.Day4;

public class Demo8 {
    public static void main(String[] args) {

    }
}

interface Drawable{
    void draw();

    // added in Java8
    // to be able to implement methods in interfaces it needs to be default or static
    default void print(){
        System.out.println("Printing...");
    }
}

class Rectangle2 implements Drawable{

    @Override
    public void draw() {

    }
}

class Circle2 implements Drawable{

    @Override
    public void draw() {

    }
}