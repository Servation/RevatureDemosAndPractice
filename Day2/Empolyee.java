package com.revature.Day2;

public class Empolyee {
    private String firstName, lastName, empolyeeID, address;
    private int age, salary;

    public Empolyee(String firstName, String lastName, String empolyeeID, String address, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empolyeeID = empolyeeID;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmpolyeeID() {
        return empolyeeID;
    }

    public void setEmpolyeeID(String empolyeeID) {
        this.empolyeeID = empolyeeID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
