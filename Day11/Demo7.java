package com.revature.Day11;

import java.io.File;

public class Demo7 {
    public static void main(String[] args) {
        File file = new File("db");
        System.out.println(file.exists());
        file.mkdir();
        System.out.println(file.exists());
    }
}
