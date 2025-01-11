package com.bfs;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
        animal.run();
        add(1, 2);
        add(1, 2.0);
    }

    public static int add(int x, int y){
        return x + y;
    }

    public static int add(int x, double y){
        return (int) (x + y);
    }
}
