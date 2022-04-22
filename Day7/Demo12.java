package com.revature.Day7;

public class Demo12 {
    public static void main(String[] args) throws Exception {
        doSomething();
    }

    public static void doSomething() throws Exception {
        doSomethingElse();
    }

    public static void doSomethingElse() throws Exception {
        doSomethingSomethingElse();
    }

    public static void doSomethingSomethingElse() throws Exception { // throws is in the signature of the method
        throw new Exception();
    }
}
