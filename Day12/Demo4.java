package com.revature.Day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(2, "Mark", 30));
        students.add(new Student(1, "Watson", 50));
        students.add(new Student(3, "Stacy", 20));

        System.out.println("before sorting...");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("------------");
//        Collections.sort(students);
//        Collections.reverse(students);
//        Collections.sort(students, new SortByName());
//        Collections.sort(students, Comparator.comparing(student -> student.name));
        Collections.sort(students, (currStudent, nextStudent) -> currStudent.name.compareTo(nextStudent.name));
        System.out.println("after sorting...");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student>{
    int rollNumber;
    String name;
    int age;

    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.rollNumber - other.rollNumber;
    }
}

class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
