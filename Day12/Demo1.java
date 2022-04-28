package com.revature.Day12;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(6);
        numbers.add(5);

        System.out.println("before sorting...");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("-------------");
        Collections.sort(numbers); // sort method in collection class
        System.out.println("after sorting...");
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
