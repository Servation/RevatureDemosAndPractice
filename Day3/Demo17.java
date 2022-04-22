package com.revature.Day3;

public class Demo17 {
    public static void main(String[] args) {
        Car2 car = new Car2();
        car.drive();
    }
}

class Car2 {
    public final int speedLimit = 60; //Constant

    public void drive() {
        //speedLimit = 100; Can't be changed because speedLimit is a constant
        System.out.println("Car is driving at max speed of " + speedLimit);
    }
}
