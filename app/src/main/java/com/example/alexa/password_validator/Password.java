package com.example.alexa.password_validator;

import java.util.regex.Pattern;

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
                pass.length() > 8 &&
                containsChars()&&
                containsNums()&&
                containsSpecialChar();
    }

    private boolean containsSpecialChar() {
        return Pattern.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+.*", pass);
    }

    private boolean containsNums() {
        return Pattern.matches(".*[0-9]+.*", pass);
    }

    private boolean containsChars(){
        return Pattern.matches(".*[a-z].*", pass) &&
                Pattern.matches(".*[A-Z].*", pass);
    }

}
