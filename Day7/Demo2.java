package com.revature.Day7;

public class Demo2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 0;

        try{
            c = a / b;
        } catch (ArithmeticException ex){ // handles only ArithmeticExceptions
            System.out.println("invalid number");
        } catch (Exception ex){ // handles any exception and needs to go after other exception
            System.out.println("exception occur");
        } finally { // always happens
            System.out.println("finally");
        }
    }
}
