package com.revature.Day3;

public class Demo12 {
    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }
}

class Test{
    static int a;

    static{
        a = 20;
        System.out.println(a);
    }

    public void display(){
        a = 30;
        System.out.println(a);
    }
}
