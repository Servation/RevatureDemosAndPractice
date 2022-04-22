package com.revature.Day3;

public class Demo10 {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Mark");
        Customer customer2 = new Customer(2, "Paul");
        customer1.printInfo();
        customer2.printInfo();
    }
}

class Customer {
    public int customerID;
    public String customerName;
    public static String companyName = "Revature";

    public Customer(int empId, String name){
        this.customerID = empId;
        this.customerName = name;
    }

    public void printInfo(){
        System.out.println("Id: " + customerID + ", Customer name: " + customerName + ", Company name: " + companyName);
    }
}
