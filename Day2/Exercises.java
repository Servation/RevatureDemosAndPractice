package com.revature.Day2;

public class Exercises {
    public static void main(String[] args) {
        question2(14);
        System.out.println();
        question3(8);
        System.out.println();
        question4(8);
        System.out.println();
        question5(10);
        System.out.println();
        question6(8);
        System.out.println();
        question7(13);
        System.out.println();
        question8();
        System.out.println();
        question9(8);
    }

    public static void question2(int number) {
        int sum = 0;
        int counter = 1;
        while (counter <= number) {
            if (counter % 2 == 0) {
                sum += counter;
            }
            counter++;
        }
        System.out.println("The sum of evens from 1 to "+ number + ": " + sum);
    }

    public static void question3(int number){
        for (int i = 1; i <= 10; i++){
            System.out.println(i + " x " + number + " = " + (i * number));
        }
    }

    public static  void question4(int number){
        for (int i = 10; i >= 1; i--){
            System.out.println(i + " x " + number + " = " + (i * number));
        }
    }

    public static void question5(int number){
        int factorial = 1;
        for(int i = 1; i <= number; i++){
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }

    public static void question6(int number){
        int factorial = 1;
        int counter = 1;

        while(counter <= number){
            factorial *= counter;
            counter++;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }

    public static void  question7(int number){
        int sum = 0;
        for (int i = 1; i<= number; i++){
            if (i % 2 == 0){
                sum+= i;
            }
        }
        System.out.println("The sum of evens from 1 to "+ number + ": " + sum);
    }

    public static void question8(){
        System.out.println("What can be done using one type of loop can also be done using the other two types of loops: " + true);
    }

    public static void question9(int number){
        int sum = 0;
        for(int i = 1; i <= number; i++){
            sum += i * 8;
        }
        System.out.println("The sum of the multiplication table from 1 to " + number + " multiplied by 8 is : " + sum);
    }
}
