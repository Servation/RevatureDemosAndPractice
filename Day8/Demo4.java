package com.revature.Day8;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Watson");

        // iterator
        Iterator iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------------");

        // for-each
        for (String name :names){
            System.out.println(name);
        }
        System.out.println("--------------");

        // for loop
        for(int i=0; i< names.size(); i++){
            System.out.println(names.get(i));
        }
        System.out.println("---------------");

        // for_each
        names.forEach(name -> System.out.println(name)); // lambda expression in the method parameter of forEach method
    }
}
