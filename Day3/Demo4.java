package com.revature.Day3;

public class Demo4 {
    public static void main(String[] args) {
        Child c = new Child();
        c.childMethod();
        c.parentMethod();

        Parent p = new Parent();
        p.parentMethod();
        // p.childMethod();
    }
}

class Parent {
    public Parent() {
        System.out.println("parent constructor");
    }

    public void parentMethod() {

    }
}

class Child extends Parent {
    public Child() {
        System.out.println("child constructor");
    }

    public void childMethod() {

    }
}

