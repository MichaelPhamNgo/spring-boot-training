package com.springboot.app.java8.defaultmethod.diamondproblem;

public class SomeClass implements A, B{
    @Override
    public void foo() {
        A.super.foo();
        B.super.foo();
    }

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        someClass.foo();
    }
}
