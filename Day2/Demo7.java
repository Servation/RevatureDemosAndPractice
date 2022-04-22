package com.revature.Day2;

public class Demo7 {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator(200, 100);
        cal1.addNumber();
        cal1.subtractNumber();
        cal1.multiplyNumber();
        cal1.divideNumber();
    }
}

class Calculator{
    public int num1;
    public int num2;

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addNumber(){
        System.out.println("Sum: " + (num1 + num2));
    }

    public void subtractNumber(){
        System.out.println("Subtraction: " + (num1 - num2));
    }

    public void multiplyNumber(){
        System.out.println("multiplication: " + (num1 * num2));
    }

    public void divideNumber(){
        System.out.println("Divide: " + ((double)num1/num2));
    }
}
