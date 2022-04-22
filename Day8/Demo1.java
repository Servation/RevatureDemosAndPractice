package com.revature.Day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<String> mList =  new ArrayList<>();
        mList.add("Mark");
        mList.add("Paul");
        mList.add("John");

        System.out.println(mList);

        // iterator
        Iterator<String> iterator = mList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("************************");
        // forEach or enhanced for loop
        for(String name : mList){
            System.out.println(name);
        }
    }
}
