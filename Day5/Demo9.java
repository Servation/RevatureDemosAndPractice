package com.revature.Day5;

import java.util.Arrays;

public class Demo9 {
    public static void main(String[] args) {
        String message = "mark@gmail.com";
        String[] result = message.split("@");
        System.out.println(Arrays.toString(result));
    }
}
