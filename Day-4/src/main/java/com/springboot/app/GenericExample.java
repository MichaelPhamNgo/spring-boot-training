package com.springboot.app;

public class GenericExample<T> {
    private T t;

    public GenericExample(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
