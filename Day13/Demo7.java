package com.revature.Day13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", null, "Book", "Sky", null, null, "Table");
        System.out.println(words);

        List<String> result = words.stream().filter(word -> word != null).collect(Collectors.toList());
        System.out.println(result);
    }
}
