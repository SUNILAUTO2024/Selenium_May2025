package com.Variables;

public class check_Email {
    //Check if an email address contains both '@' and '.' in valid positions.

    private void checkEmail() {

        String email = "example@example.com";


        boolean isValid = email.contains("@") && email.contains(".") && email.indexOf("@") < email.indexOf(".");

    }

    void test(){
        System.out.println("Test user");
    }
}
