package com.springboot.app.exception;

public class MyException extends Exception{

    public MyException(String message) {
        super(message);
    }

    public static void main(String[] args) throws MyException {
        throw new MyException("Something went wrong");
    }
}
