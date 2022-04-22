package com.revature.Day3;

public class Demo16 {
    public static void main(String[] args) {
        Bank first = new Bank();
        BankA second = new BankA();
        BankB third = new BankB();
        System.out.println("Interest of Bank " + first.getRateOfInterest());
        System.out.println("Interest of BankA " + second.getRateOfInterest());
        System.out.println("Interest of BankB " + third.getRateOfInterest());
    }
}

class Bank {
    public int getRateOfInterest() {
        return 2;
    }
}

class BankA extends Bank {
    @Override
    public int getRateOfInterest() {
        return 5;
    }
}

class BankB extends Bank {
    @Override
    public int getRateOfInterest() {
        return super.getRateOfInterest();
    }

}
