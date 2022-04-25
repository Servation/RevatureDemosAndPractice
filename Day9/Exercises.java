package com.revature.Day9;

import java.util.ArrayList;
import java.util.Collections;

// LinkedList or ArrayList
// 1. Write a Java program to append the specified element to the end of a linkedList
// 2. Write a java program to iterate through all elements in a linked list
// 3. Write a Java program to iterate through all elements in a linked list starting at the
//    specified position
// 4. Write a Java program to iterate a linked list in reverse order
// 5. Write a Java program to insert the specified element at the specified position in the
//    linked list.
public class Exercises {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        // 1
        appendToEnd("A", arrayList);
        appendToEnd("B", arrayList);
        appendToEnd("C", arrayList);
        appendToEnd("D", arrayList);

        // 2
        System.out.println(allElements(arrayList));
        System.out.println();

        // 3
        System.out.println(allElementsFrom(1, arrayList));
        System.out.println();

        // 4
        System.out.println(allElementsReverse(arrayList));
        System.out.println();

        // 5
        insertElementToArrAt(0, "E", arrayList);

        System.out.println(allElements(arrayList));
    }

    // 1
    public static void appendToEnd(String el, ArrayList<String> arr){
        arr.add(el);
    }

    // 2
    public static String allElements(ArrayList<String> arr){
        StringBuilder output = new StringBuilder();

        arr.forEach(item -> output.append(item).append("\n"));
        return output.toString();
    }

    // 3
    public static String allElementsFrom(int num, ArrayList<String> arr){
        StringBuilder output = new StringBuilder();

        for(int i = num; i < arr.size(); i++){
            output.append(arr.get(i)).append("\n");
        }
        return output.toString();
    }

    // 4
    public static String allElementsReverse(ArrayList<String> arr){
        StringBuilder output = new StringBuilder();
        Collections.reverse(arr);

        arr.forEach(item -> output.append(item).append("\n"));
        return output.toString();
    }

    // 5
    public static void insertElementToArrAt(int pos, String item, ArrayList<String> arr) {
        arr.add(pos,item);
    }
}
