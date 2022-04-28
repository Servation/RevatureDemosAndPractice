package com.revature.Day12;

public class Demo6 {
    public static void main(String[] args) {
        MyClass<String> myClass = new MyClass<>();
        myClass.obj = "Hello";
        myClass.add("World");
        String a = myClass.get();
        System.out.println(a); // World

        MyClass<Integer> myClass2 = new MyClass<>();
        myClass2.obj = 100;
        myClass2.add(200);
        System.out.println(myClass2.get()); // 200
    }
}

class MyClass<T> {
    T obj;

    void add(T obj1) {
        this.obj = obj1;
    }

    T get() {
        return obj;
    }
}
