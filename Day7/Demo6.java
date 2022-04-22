package com.revature.Day7;

public class Demo6 {
    public static void main(String[] args) {
        // case 1: Exception not occur
        try {
            int c = 10 / 5;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("case 1: finally called");
        }

        // case 2: Exception occurs but not handled
        try {
            int c = 10 / 0;
        } finally {
            System.out.println("case 2: finally called");
        }

        // case 3: Exception occurs but handled
        try {
            int c = 10 / 0;
        } catch (Exception ex) {
            System.out.println("exception occurred and handled");
        } finally {
            System.out.println("case 2: finally called");
        }
    }
}
