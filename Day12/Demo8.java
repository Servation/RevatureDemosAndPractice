package com.revature.Day12;

public class Demo8 {
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2("Mark");
        Employee2 emp2 = new Employee2(123);

    }
}

class Employee2 {
    String name;

    public <T> Employee2(T name) {
        this.name = name.toString();
    }
}