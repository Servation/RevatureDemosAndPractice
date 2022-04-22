package com.revature.Day4;

public class Demo12 {
    public static void main(String[] args) {
        Customer objCustomer = new Customer();
        objCustomer.firstName = "Bob";
        objCustomer.lastName = "the builder";

        ChildTest objChild = new ChildTest();
        objChild.firstName = "Mark";
        objChild.lastName = "Smith";
    }
}

class ChildTest extends Customer {

}

class A {

}

class Customer {
    protected String firstName;
    protected String lastName;

    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }
}
