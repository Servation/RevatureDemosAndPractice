package com.revature.Day4;

public class Demo2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12.34, 56.78);
        Circle circle = new Circle(55.55);
        
        rectangle.draw();
        circle.create();

        rectangle.getArea();
        circle.getArea();
    }
}

abstract class Shape {
    public final float pi = 3.14f;
    public double width;
    public double height;
    public double radius;
    
    public abstract void getArea();
}

class Rectangle extends Shape {
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("Rectangle drawing...");
    }

    @Override
    public void getArea() {
        System.out.println("Area: " + (width * height));
    }
}

class Circle extends Shape{
    public Circle(double radius){
        this.radius = radius;
    }
    
    public void create(){
        System.out.println("Circle is drawing...");
    }

    @Override
    public void getArea() {
        System.out.println("Area: " + (pi * radius * radius));
    }
}
