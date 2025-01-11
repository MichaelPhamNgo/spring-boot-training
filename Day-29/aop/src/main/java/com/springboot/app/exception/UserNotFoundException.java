package com.springboot.app.exception;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String s) {
        super(s);
    }
}
