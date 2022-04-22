package com.revature.Day4;

public class Demo13 {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
//        student.studentId = 100;
//        student.studentName = "Mark";
//
//        System.out.println("Student ID: " + student.studentId);
//        System.out.println("Student Name: "+student.studentName);
//        System.out.println("Pass Mark: "+student.passMark);

        student.setStudentId(100);
        student.setStudentName("Mark");
//        System.out.println("Student ID: " + student.getStudentId());
//        System.out.println("Student Name: " + student.getStudentName());
//        System.out.println("Pass Mark: " + student.getPassMark());
        System.out.println(student);
    }
}

class Student {
    private int studentId;
    private String studentName;
    private int passMark = 50;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) throws Exception {
        if (studentId <= 0)
            throw new Exception("Id cannont be negative");
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) throws Exception {
        if (studentName.isBlank())
            throw new Exception("Name cannot be blank");
        this.studentName = studentName;
    }

    public int getPassMark() {
        return passMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", passMark=" + passMark +
                '}';
    }
}