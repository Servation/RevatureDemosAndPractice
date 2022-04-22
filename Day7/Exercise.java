package com.revature.Day7;

import java.util.ArrayList;

public class Exercise {
    public static void main(String[] args) throws Exception { // 3 and 4

        // 1 Program try catch finally block
        try {

        } catch (Exception e) {

        } finally {

        }

        // 2 multiple catch with single try
        try {
        } catch (ArithmeticException ex) {

        } catch (Exception ex) {

        } finally {

        }

        // 3 Program illustrating throws on signature
        // throw new Exception();
        // 4 Program chained exception
        // chainOne();

        // 5 Program using custom exception
        try {
            if (false)
                throw new CustomException();
        } catch (CustomException ex) {

        }

        // 6 Program to validate student record
        StudentRecords student1 = new StudentRecords("John");
        student1.addGrade(120);

        // 7 Program to prevent creation of second object

        try {
            Once one = new Once();
            Once two = new Once();
        } catch (NoMoreException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void chainOne() throws Exception {
        chainTwo();
    }

    public static void chainTwo() throws Exception {
        throw new Exception();
    }
}

// class for question 6

class StudentRecords {
    private String fullName;
    private ArrayList<Integer> grades;

    public StudentRecords(String fullName) {
        this.fullName = fullName;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        try {
            if (grade >= 0 && grade <= 100) {
                grades.add(grade);
                System.out.println("Grade added");
            } else {
                throw new Exception("Can't add grade");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

// custom exception for question 5
class CustomException extends Exception {

}

// class for question 7

class Once {
    static int count = 0;

    public Once() throws NoMoreException {
        if (count == 0) {
            count++;
        } else {
            throw new NoMoreException();
        }
    }
}

// custom exception for question 7
class NoMoreException extends Exception {
    public NoMoreException() {
        super("No more than 1 object");
    }
}


