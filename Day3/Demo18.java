package com.revature.Day3;

public class Demo18 {
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.drive(); // uses the bike classes method
    }
}

class Bike {
    public final void drive(){
        System.out.println("Driving....");
    }
}

class Honda extends Bike{
//    Can't override a final method from the parent class
//    @Override
//    public void drive() {
//        System.out.println("not driving...");
//    }
}
