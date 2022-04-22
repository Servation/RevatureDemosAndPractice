package com.revature.Day3;

public class Demo1 {
    public static void main(String[] args) {
//        Employee employee = new Employee();
//        employee.firstName = "Mark";
//        employee.lastName = "Smith";
//        employee.getFullName();

        Employee employee = new Employee("Mark", "Smith");
        employee.getFullName();
    }
}
class Employee {
    public String firstName;
    public String lastName;

    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void getFullName(){
        System.out.println(firstName + " " + lastName);
    }
}
