package com.revature.Day9;

import java.util.TreeSet;

public class Demo4 {
    public static void main(String[] args) {
        // create TreeSet and add elements
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Mark");
        treeSet.add("Watson");
        treeSet.add("Paul");
        treeSet.add("Apple");
        for (String name : treeSet) {
            System.out.println(name);
        }
    }
}
