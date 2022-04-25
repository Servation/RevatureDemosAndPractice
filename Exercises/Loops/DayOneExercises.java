package com.revature.Exercises.Loops;

import java.util.Scanner;

public class DayOneExercises {
    public static void main(String[] args) {
        exercise1();
        System.out.println();
        exercise2();
        System.out.println();
        exercise3(4);
        System.out.println();
        exercise4(3);
        exercise5(5);
        System.out.println();
        exercise6();
        System.out.println();
        exercise7();
        System.out.println();
        exercise8();
        System.out.println();
        exercise9(4);
        System.out.println();
        exercise10();
    }

    public static void exercise1() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void exercise2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void exercise3(int size) {
        for (int i = 1; i <= size; i++) {
            printSpace(size - i);
            printStar(i);
        }
    }

    public static void exercise4(int size) {
        for (int i = size; i >= 0; i--) {
            printSpace(size - i);
            printStar(i);
        }
    }

    public static void exercise5(int size) {
        for (int i = 5; i >= 0; i--) {
            printSpace(i * 2);
            printStar(size - i);
        }
    }

    public static void exercise6() {
        int greatest = 0;
        System.out.println("Test Data");
        for (int i = 0; i < 3; i++) {
            String currentNum = i == 0 ? "1st" : i == 1 ? "2nd" : "3rd";
            System.out.print("Input the " + currentNum + " number: ");
            int number = numInput();
            if (number > greatest) greatest = number;
        }
        System.out.println();
        System.out.println("The greatest: " + greatest);
    }

    public static void exercise7() {
        System.out.println("Test Data");
        System.out.print("Input the number (Table to be calculated) : Input number of terms: ");
        int number = numInput();
        System.out.println();
        for (int i = 0; i <= number; i++) {
            System.out.println(number + " X " + i + " = " + (i * number));
        }
    }

    public static void exercise8() {

        System.out.println("Test Data");
        System.out.print("Input number of rows: ");
        int number = numInput();

        for (int i = 0; i < number; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void exercise9(int size) {
        for (int i = 1; i <= size; i++) {
            printSpace(size - i);
            printNumber(i, i);
        }

    }

    public static void exercise10() {
        System.out.println("Test Data");
        System.out.print("input number of rows: ");
        int size = numInput();
        System.out.println();
        exercise3(size);
        for (int i = size - 1; i >= 0; i--) {
            printSpace(size - i);
            printStar(i);
        }
    }

    public static int numInput() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static void printSpace(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printStar(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void printNumber(int amount, int number) {
        for (int i = 1; i <= amount; i++) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

}
