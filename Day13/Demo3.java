package com.revature.Day13;


import java.util.ArrayList;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Paul");
        list.add("Watson");
        list.add("John");

        list.forEach(System.out::println);
    }
}
