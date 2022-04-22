package com.revature.Day2;

public class Demo11 {
    public static void main(String[] args) {
        Car carObj = new Car();
    }
}
class Car{
    private String brand;
    private String modelName;
    private String manufacturingYear;
    private String color;
    private  int price;

    public void drive(){
        System.out.println("driving.....");
    }

    public void stop(){
        System.out.println("stopping....");
    }
}
