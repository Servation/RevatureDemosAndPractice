package com.revature.Day7;
/*
 NullPointerException

 Throwable -> Exception -> RuntimeException -> NullPointerException
*/

public class Demo9 {
    public static void main(String[] args) {
        String str = "Mark";
        System.out.println(str.length()); // 4

        String str2 = null;
        try {
            System.out.println(str2.length()); // exception
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }

        Customer customer = new Customer();
        customer.display();

        Customer customer1 = null;
        try {
            customer1.display();
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        }

    }
}

class Customer{
    public void display(){
        System.out.println("displaying....");
    }
}
