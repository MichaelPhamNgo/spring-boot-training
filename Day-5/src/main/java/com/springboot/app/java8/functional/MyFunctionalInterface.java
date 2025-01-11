package com.springboot.app.java8.functional;

@FunctionalInterface
public interface MyFunctionalInterface {

    void foo();

    default String bar() {
        return "say something";
    }

    default void sdfsfda() {
        System.out.println("something");
    }

    static void zar() {
        System.out.println("1 2 3");
    }
}
