package com.example.alexa.password_validator;

/**
 * Created by alexa on 5/28/2017.
 */

class Password {
    private String pass;

    Password(String pass){
        this.pass = pass;
    }

    boolean isValid(){
        return !pass.toLowerCase().equals("password") &&
                pass.length() > 8;
    }

}
