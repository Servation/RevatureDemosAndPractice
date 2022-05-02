package com.revature.Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("numbers list: " + numbers);

        // without stream
        List<Integer> finalList = new ArrayList<>();
        for (Integer number : numbers) {
            int result = number * 5;
            finalList.add(result);
        }
        System.out.println("numbers list multiplied by 5 without using stream: " + finalList);

        // stream
        List<Integer> finalList2 = numbers
                .stream()
                .map(num -> num *5)
                .collect(Collectors.toList());

        System.out.println("numbers list multiplied by 5 using stream: " +finalList2);

        List<Integer> squares = numbers
                .stream()
                .map(x -> x *x)
                .collect(Collectors.toList());
        System.out.println("numbers list multiplied by itself using stream: " + squares);
    }
}
