package com.revature.Exercises.IO;

import java.io.*;
import java.util.Scanner;

/**
 1. Write a Java program to get a list of all files/directory names from the given
 2. Write a Java program to get specific files by extensions from a specified folder
 3. Write a Java program to check if a file or directory specified by pathname exists or not.
 4. Write a Java program to check if given pathname is a directory or a file.
 5. Write Java program to read input from java console.
 6. Write a Java program to read a file content line by line.
 7. Write a Java program to read first 3 lines from a file
 8. Write a Java program to find the longest word in a text file.
 */

public class Exercises {
    public static void main(String[] args) {
        // 1
        System.out.println("All files in src/com/revature/Exercises: ");
        File ex1File = new File("src/com/revature/Exercises");
        System.out.println(ex1(ex1File));

        // 2
        System.out.println("Files matching the extension \"txt\" in db folder: ");
        File ex2File = new File("db");
        System.out.println(ex2(ex2File, "txt"));

        // 3
        System.out.println("Check if files or directory exists in db2 folder: ");
        File ex3File = new File("db2");
        System.out.println(ex3(ex3File));
        System.out.println();

        // 4
        System.out.println("Check if this file is a directory or a file");
        File ex4File = new File(ex1File, "IO/Exercises.java");
        System.out.println(ex4(ex4File));
        System.out.println();

        // 5
        System.out.println("Read input from java console: ");
        System.out.println("You typed: " + ex5());
        System.out.println();

        // 6
        System.out.println("Content of file data2.txt: ");
        File ex6File = new File("data2.txt");
        System.out.println(ex6(ex6File));

        // 7
        System.out.println("Reading content of first 3 lines from data2.txt: ");
        System.out.println(ex7(ex6File));

        // 8
        System.out.println("The longest word in the file data2.txt: ");
        System.out.println(ex8(ex6File));
    }

    // 1
    public static String ex1(File file){
        String[] listOfFileDir = file.list();
        StringBuilder out = new StringBuilder();
        for (String f : listOfFileDir) {
            out.append(f).append("\n");
        }
        return out.toString();
    }

    // 2
    public static String ex2(File file, String extension) {
        String[] listOfFiles = file.list();
        StringBuilder out = new StringBuilder();
        for (String f : listOfFiles) {
            int index = f.lastIndexOf('.');
            if (f.substring(index+1).equals(extension)) {
                out.append(f).append("\n");
            }
        }
        return out.toString();
    }

    // 3
    public static String ex3(File file) {
        File f1 = new File(file,"second.txt");
        return "Does the file second.txt in db2 exist: " + f1.exists() + "\n" + "Does the folder db2 exist: " + file.exists();
    }

    // 4
    public static String ex4(File file){
        return "Is it a file: " + file.isFile();
    }

    // 5
    public static String ex5(){
        String input = "You didn't type anything out";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

    // 6
    public static String ex6(File file) {
        StringBuilder out = new StringBuilder();
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                out.append(fileReader.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return out.toString();
    }

    // 7
    public static String ex7(File file) {
        StringBuilder out = new StringBuilder();
        try {
            int count = 0;
            Scanner fileReader = new Scanner(file);
            while (count < 3 && fileReader.hasNextLine()) {
                count++;
                out.append(fileReader.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return out.toString();
    }

    public static String ex8(File file) {
        String out = "";
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                String current = fileReader.next();
                if (current.length() > out.length()) {
                    out = current;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return out;
    }
}
