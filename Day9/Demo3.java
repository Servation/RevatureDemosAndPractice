package com.revature.Day9;

import java.util.HashSet;
import java.util.Iterator;

public class Demo3 {
    public static void main(String[] args) {
        // create HashSet and add elements
        HashSet<String> set = new HashSet<>();
        set.add("Mark");
        set.add("Paul");
        set.add("Watson");
        set.add("Mark"); // will be ignored because it has to be unique
        set.add(null);
        set.add(null); // will be ignored

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // HashSet methods:
        // remove()
        // removeAll()
        // removeIf()
        // clear()

        set.remove("Paul");
        System.out.println(set);
    }
}
