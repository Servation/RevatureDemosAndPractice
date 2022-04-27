package com.revature.Day11;

import java.io.FileWriter;
import java.io.IOException;

public class Demo12 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("data2.txt", true); // true makes it append instead of overwriting the file
        fw.write(100); // single character
        fw.write("\n"); // makes a new line
        fw.write("This is a message");
        fw.write("\n");
        char[] c1 = {'h', 'e', 'l', 'l', 'o'};
        fw.write(c1);
        fw.write("\n");

        fw.flush();
        fw.close();
    }
}
