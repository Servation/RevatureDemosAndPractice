package com.revature.Day11;

import java.io.File;

public class Demo10 {
    public static void main(String[] args) {
        int count = 0;
        File file = new File("db");
        String[] list = file.list();
        for (String s : list) {
            File f = new File(file, s);
            if (f.isFile()) { // can use isDirectory() to check for directories instead of files
                System.out.println(s);
                count++;
            }
        }
        System.out.println("file count: " + count);
    }
}
