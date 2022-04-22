package com.revature.Day2;

public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    private int age;
    private double gradePointAvg;

    public Student(String firstName, String lastName, String studentID, int age, double gradePointAvg) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.age = age;
        this.gradePointAvg = gradePointAvg;
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

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGradePointAvg() {
        return gradePointAvg;
    }

    public void setGradePointAvg(double gradePointAvg) {
        this.gradePointAvg = gradePointAvg;
    }
}
