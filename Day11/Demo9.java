package com.revature.Day11;

import java.io.File;

public class Demo9 {
    public static void main(String[] args) {
        int count = 0;
        File file = new File("db");
        String[] list = file.list();
        for (String s : list) {
            count++;
            System.out.println(s);
        }
        System.out.println("Total number of files and folders: " + count);
    }
}
