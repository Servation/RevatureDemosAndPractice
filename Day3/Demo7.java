package com.revature.Day3;

public class Demo7 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.rollNumber = 1;
        student1.name = "Mark";

        Student student2 = new Student();
        student2.rollNumber = 2;
        student2.name = "Paul";
        System.out.println(Student.schoolName + " and " + student2.schoolName);

    }
}

class Student{
    public int rollNumber;
    public String name;
    static public String schoolName = "ABC School";
}
