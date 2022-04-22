package com.revature.Day7;

class EmployeeException extends Throwable{

}

public class Demo3 {

    public static void main(String[] args) throws EmployeeException { // lets caller of function handle exception
//        ArithmeticException exception = new ArithmeticException();
//        throw exception;

//        EmployeeException ex = new EmployeeException();
//        try {
//            throw ex;
//        } catch (EmployeeException e){
//            e.printStackTrace();
//        }


        throw new EmployeeException();
    }
}
