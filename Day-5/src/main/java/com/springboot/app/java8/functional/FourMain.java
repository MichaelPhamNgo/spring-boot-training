package com.springboot.app.java8.functional;


import com.springboot.app.java8.stream.User;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FourMain {
    public static void main(String[] args) {
//        Consumer<Integer> consumer = a -> System.out.println(a);
//        Supplier<Integer> supplier = () -> 0;
//        Predicate<String> predicate = a -> a.length() > 6;
//        Function<String, Integer> function = a -> a.length();
//        consumer.accept(2);
//        System.out.println(supplier.get());
//        System.out.println(predicate.test("hello world"));
//        System.out.println(function.apply("hello world"));

//        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("hello world");
//        myFunctionalInterface.foo();
        List<User> users = Arrays.asList(
                new User("Bob", "123", 10),
                new User("Alice", "234", 12),
                new User("John", "345", 14),
                new User("Bob", "123", 10),
                new User("Xerox", "567", 100)
        );
        users.sort((user1, user2) -> {
            return user1.getAge() - user2.getAge();
        });

        Comparable<User> comparable = a -> 0;

        Function<Integer, Integer> function = (number) -> number * 2;

        System.out.println(users);
    }
}
