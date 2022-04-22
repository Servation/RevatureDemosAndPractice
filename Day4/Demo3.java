package com.revature.Day4;

public class Demo3 {
    public static void main(String[] args) {

    }
}

abstract class Test1 {
    public abstract void display1();
}

abstract class Test2 extends Test1{
    public abstract void display2();
}

abstract class Test3 extends Test2{
    public abstract void display3();
}

class Output2 extends Test3{
    // Abstract method display1 from abstract class Test1 that must be implemented
    @Override
    public void display1() {

    }

    // Abstract method display2 from abstract class Test2 that must be implemented
    @Override
    public void display2() {

    }

    // Abstract method display3 from abstract class Test3 that must be implemented
    @Override
    public void display3() {

    }
}
