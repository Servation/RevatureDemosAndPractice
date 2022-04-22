package com.revature.Day7;

public class Demo5 {
    public static void main(String[] args) {
        Authentication auth = new Authentication();
        auth.login("admin", "123");
        auth.login("admin", "123");
    }
}

class Authentication{

    private boolean isLoggedIn = false;
    public void login(String email, String password){
        if(!isLoggedIn) {
            if (email.equals("admin") && password.equals("123")) {
                System.out.println("login successful");
                isLoggedIn = true;
            } else {
                System.out.println("login failed, try again");
            }
        } else {
            try {
                throw new UserAlreadyLoggedInException();
            } catch (UserAlreadyLoggedInException e) {
                System.out.println("Hey, you already logged in");
            }
        }
    }
}

class UserAlreadyLoggedInException extends Exception{

}


