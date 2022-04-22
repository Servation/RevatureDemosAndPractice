package com.revature.Day8;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Watson");

        System.out.println(names);

        // getting the element on a specific index
        System.out.println(names.get(1)); // Paul

        // adding the element on a specific index
        names.add(1, "John");
        System.out.println(names);

        // merge two list
        ArrayList<String> newNames = new ArrayList<>();
        newNames.add("Smith");
        newNames.add("Stacy");

//        names.addAll(newNames);
//        System.out.println(names);

        // adding the second list of elements to a specified index
        names.addAll(0, newNames);
        System.out.println(names);

        // remove
        names.remove("Mark");
        System.out.println(names);

        // remove at index
        names.remove(0);
        System.out.println(names);

        // removing the elements based on a condition
        names.removeIf(name -> name.contains("Paul"));
        System.out.println(names);
    }
}
