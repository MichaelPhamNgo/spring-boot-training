package com.springboot.app.java8.defaultmethod.diamondproblem;

public interface A {
    default void foo() {
        System.out.println("A");
    }
}
