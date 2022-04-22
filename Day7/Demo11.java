package com.revature.Day7;

public class Demo11 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        try {
            c = a / b;
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } catch (NullPointerException | NumberFormatException ex) { // common catch block use '|'
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
