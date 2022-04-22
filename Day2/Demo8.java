package com.revature.Day2;

public class Demo8 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Mark", "Watson");
        employee1.getFullName();
    }
}

class Employee{
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getFullName(){
        System.out.println(firstName + " " + lastName);
    }
}
