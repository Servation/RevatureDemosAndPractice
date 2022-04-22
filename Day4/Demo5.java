package com.revature.Day4;

public class Demo5 {
    public static void main(String[] args) {
        RBI dxcBank = new DXCBank();
        dxcBank.deposit();
        dxcBank.withdraw();
    }
}

interface RBI{
    void deposit();
    void withdraw();
}

class DXCBank implements RBI{
    @Override
    public void deposit() {
        System.out.println("Depositing money...");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawing money...");
    }
}
