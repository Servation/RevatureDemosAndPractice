package com.revature.Day7;

class InSufficientFundException extends Exception{
    public InSufficientFundException(){
        System.out.println("Insufficient amount requested");
    }

    public InSufficientFundException(String message){
        super(message);
        //System.out.println(message);
    }
}

class BankAccount{
    private int balance = 0;
    private  int accountNumber;

    public BankAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Amount added: " + amount);

    }

    public void withdraw(int amount) throws InSufficientFundException {
        if (amount<= balance){
            balance -= amount;
            System.out.println("Amount removed: " + amount);
        } else {
            throw new InSufficientFundException("This is an invalid request");
        }
    }

    public int getBalance() {
         return  balance;
    }
}
public class  Demo4 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456);
        System.out.println(account.getBalance());
        account.deposit(5000);
        try {
            account.withdraw(2000);
        } catch (InSufficientFundException e) {
            e.printStackTrace();
        }

        account.deposit(1000);
        try {
            account.withdraw(10000);
        } catch (InSufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}
