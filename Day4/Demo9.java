package com.revature.Day4;

public class Demo9 {
    public static void main(String[] args) {
        Drawable2 c = new Circle3();
        c.draw();
        Drawable2.area();
    }
}

interface Drawable2{
    void draw();
    // static method interface
    static void area(){
        System.out.println("getting area...");
    }
}

class Circle3 implements Drawable2{

    @Override
    public void draw() {
        System.out.println("Drawing...");
    }
}
