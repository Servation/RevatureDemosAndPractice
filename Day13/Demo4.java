package com.revature.Day13;

public class Demo4 {
    public static void main(String[] args) {
        IDisplay display = (message) ->{
            String str1 = "Hello ";
            String str3 = ", How are you?";
            return str1 + message + str3;
        };
        System.out.println(display.message("Paul"));
    }
}

interface IDisplay {
    String message(String str);
}
