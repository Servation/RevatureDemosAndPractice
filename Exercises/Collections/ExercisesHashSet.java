package com.revature.Exercises.Collections;

// HashSet
// 1. Write a Java program to append the specified element to the end of a hash set.
// 2. Write a Java program to iterate through all elements in a hash list.
// 3. Write a Java program to get the number of elements in a hash set.
// 4. Write a Java program to empty a hash set.


import java.util.HashSet;

public class ExercisesHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        // 1
        appendToHashSet("A", hashSet);
        appendToHashSet("B", hashSet);
        appendToHashSet("C", hashSet);
        appendToHashSet("D", hashSet);

        // 2
        System.out.println("iterating through a HashSet: ");
        System.out.println(iterateThroughHashSet(hashSet));

        // 3
        System.out.println("Number of items: " + numOfElementsHashSet(hashSet));

        // 4
        emptyHashSet(hashSet);
        System.out.println("Number of items after emptying HashSet: " + numOfElementsHashSet(hashSet));
    }

    // 1
    public static void appendToHashSet( String item, HashSet<String> set){
        set.add(item);
    }

    // 2
    public static String iterateThroughHashSet(HashSet<String> set){
        StringBuilder output = new StringBuilder();
        set.forEach(item -> output.append(item).append("\n"));
        return output.toString();
    }

    public static int numOfElementsHashSet(HashSet<String> set){
        return set.size();
    }

    public static void emptyHashSet(HashSet<String> set){
        set.clear();
    }
}
