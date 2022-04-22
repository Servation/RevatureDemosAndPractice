package com.revature.Day3;

public class Demo15 {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.greeting("Mark");
        Parent1 p = new Parent1();
        p.greeting("John");
    }
}

class Parent1 {
    public void greeting(String name){
        System.out.println("Welcome " + name);
    }
}

class Child1 extends Parent1 {
    @Override
    public void greeting(String name) {
        System.out.println("Hello " + name);
    }
}
