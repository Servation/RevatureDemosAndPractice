package com.revature.Day3;

public class Demo2 {
    public static void main(String[] args) {
        Car car1 = new Car("A6", "Audi", "Black", "Petrol", 10000);
        Car car2 = new Car(car1);
        Car car3 = new Car(car2, 32089);
    }
}

class Car{
    public String name;
    public String brand;
    public String color;
    public String engineType;
    public int price;

    public Car(String name, String brand, String color, String engineType, int price) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.engineType = engineType;
        this.price = price;
    }

    public Car(Car carObj){
        this.name = carObj.name;
        this.brand = carObj.brand;
        this.color = carObj.color;
        this.engineType = carObj.engineType;
        this.price = carObj.price;
    }

    public Car(Car carObj, int price){
        this.name = carObj.name;
        this.brand = carObj.brand;
        this.color = carObj.color;
        this.engineType = carObj.engineType;
        this.price = price;

    }
}
