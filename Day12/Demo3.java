package com.revature.Day12;

import java.util.ArrayList;
import java.util.Collections;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(2, "Mark", 30));
        employees.add(new Employee(3, "Watson", 20));
        employees.add(new Employee(1, "Paul", 50));

        System.out.println("before sorting...");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("---------------");
        Collections.sort(employees);
        System.out.println("after sorting(based on age)...");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

class Employee implements Comparable<Employee>{
    public int id;
    public String name;
    public int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
//        if (this.age > o.id) {
//            return 1;
//        } else if (this.age < o.id) {
//            return -1;
//        } else {
//            return 0;
//        }
        return this.name.compareTo(o.name); // compares based on name
    }
}
