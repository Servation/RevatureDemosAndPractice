package com.revature.Day5;

public class Demo11 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);

        // append method
//        sb.append("World");
//        System.out.println(sb); //HelloWorld

        // insert method
//        sb.insert(0, "World");
//        System.out.println(sb); //WorldHello

        // replace method
//        sb.replace(1, 3, "World");
//        System.out.println(sb); //HWorldlo

        // delete
//        sb.delete(1,3);
//        System.out.println(sb); //Hlo

        sb.reverse();
        System.out.println(sb); //olleH
    }
}
