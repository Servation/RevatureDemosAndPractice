package com.revature.Day13;

import java.util.ArrayList;
import java.util.List;

public class Demo8 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Laptop", 25000));
        productList.add(new Product(2, "Mobile", 20000));
        productList.add(new Product(3, "Table", 10000));
        productList.add(new Product(4, "Chair", 8000));

        productList
                .stream()
                .filter(product -> product.price >15000)
                .forEach(product -> System.out.println(product.name));
    }
}

class Product {
    int id;
    String name;
    int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


}
