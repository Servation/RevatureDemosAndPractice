package com.revature.Day5;

public class Demo12 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // 16
        sb.append("Hellohellohelloo");
        System.out.println(sb.capacity()); // 16(old capacity)
        sb.append("Welcome to java class");
        System.out.println(sb.capacity()); // 34 (16(old capacity) * 2) + 2
    }
}
