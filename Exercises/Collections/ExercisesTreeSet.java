package com.revature.Exercises.Collections;

// TreeSet
// 1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
// 2. Write a Java program to iterate through all elements in a tree set.
// 3. Write a Java program to add all the elements of a specified tree set to another tree set.
// 4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
// 5. Write a Java program to get the first and last elements in a tree set


import java.util.Iterator;
import java.util.TreeSet;

public class ExercisesTreeSet {
    public static void main(String[] args) {
        // 1
        System.out.println("Making new TreeSet, adding colors and printing: ");
        TreeSet<String> color = questionOne();
        System.out.println();

        // 2
        System.out.println("Iterating through all elements: ");
        System.out.println(questionTwo(color));

        // 3
        System.out.println("Adding new TreeSet and adding to another TreeSet(color): ");
        questionThree(color);
        System.out.println();

        // 4
        System.out.println("In reverse order: ");
        System.out.println(questionFour(color));

        // 5
        System.out.println("Getting first and last elements: " );
        System.out.println(questionFive(color));
    }

    // 1
    public static TreeSet<String> questionOne(){
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Purple");
        colors.add("Green");
        System.out.println(colors);
        return colors;
    }

    // 2
    public static String questionTwo(TreeSet<String> set){
        StringBuilder out = new StringBuilder();
        set.forEach(item -> out.append(item).append("\n"));
        return out.toString();
    }

    // 3
    public static void questionThree(TreeSet<String> set){
        TreeSet<String> moreColors = new TreeSet<>();
        moreColors.add("Pink");
        moreColors.add("Orange");
        moreColors.add("Brown");
        set.addAll(moreColors);
        System.out.println(set);
    }

    public static String questionFour(TreeSet<String> set){
        StringBuilder out = new StringBuilder();
        Iterator iterator = set.descendingIterator();
        while (iterator.hasNext()) {
            out.append(iterator.next()).append("\n");
        }
        return out.toString();
    }

    public static String questionFive(TreeSet<String> set) {
        return "First: " + set.pollFirst() + " | Last: " + set.pollLast();
    }

}
