package com.revature.Day8;

import java.util.ArrayList;
import java.util.Collections;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("yellow");
        colors.add("red");
        colors.add("orange");
        colors.add("pink");

        // before sorting
        System.out.println("before sorting...");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println();

        // after sorting
        System.out.println("after sorting...");
        Collections.sort(colors);
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println();

        // reverse sorting
        System.out.println("reverse sorting...");
        Collections.reverse(colors);
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println();

        // list of numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(2);
        numbers.add(1);
        numbers.add(5);
        numbers.add(6);
        numbers.add(4);
        numbers.add(3);

        // before sort
        System.out.println("before sort....");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();

        // after sort
        System.out.println("after sort...");
        Collections.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
