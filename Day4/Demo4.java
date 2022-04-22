package com.revature.Day4;

public class Demo4 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.display();
        employee.print();

        // Cannot instantiate interfaces
        //IEmployee iEmployee = new IEmployee();
    }
}

// Convention for interface is starting with an 'I' for the name
interface IEmployee{
    void print();
}

class Employee implements IEmployee{

    public void display(){
        System.out.println("class display method");
    }

    // Method from interface that must be implemented
    @Override
    public void print() {
        System.out.println("interface print method");
    }
}
