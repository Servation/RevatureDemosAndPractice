package com.revature.Day3;

public class Demo6 {
    public static void main(String[] args) {
//        instantiating Simple class
//        A a = new A();
//        a.test1();
//
//        B b = new B();
//        b.test1();
//        b.test2();

//        instantiating Multi-level class
//        A a = new A();
//        a.test1();
//
//        B b = new B();
//        b.test1();
//        b.test2();
//
//        C c = new C();
//        c.test1();
//        c.test2();
//        c.test3();

//        instantiating Hierarchical class
        A a = new A();
        a.test1();

        B b = new B();
        b.test1();
        b.test2();

        C c = new C();
        c.test1();
        c.test3();
    }
}

// Simple inheritance
//class A {
//    public void test1(){
//
//    }
//}
//
//class B extends A {
//    public void test2(){
//
//    }
//}

// Multi-level inheritance
//class A {
//    public void test1(){
//
//    }
//}
//
//class B extends A {
//    public void test2(){
//
//    }
//}
//
//class C extends B {
//    public void test3() {
//
//    }
//}

// Hierarchical inheritance
class A {
    public void test1() {

    }
}

class B extends A {
    public void test2() {

    }
}

class C extends A {
    public void test3() {

    }
}
