package com.revature.Day12;

public class Demo7 {
    public static void main(String[] args) {
        Test test = new Test();
        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'A', 'B', 'C', 'D'};
        test.printArray(intArray);
        System.out.println("------------");
        test.printArray(charArray);
    }
}

class Test {
    <E> void printArray(E[] elements) { // generic method
        for (E element : elements) {
            System.out.println(element);
        }
    }
}
