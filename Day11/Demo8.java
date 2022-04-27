package com.revature.Day11;

import java.io.File;
import java.io.IOException;

public class Demo8 {
    public static void main(String[] args) {
        File dir = new File("db2");
        dir.mkdir();
        File file = new File("db2", "second.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
