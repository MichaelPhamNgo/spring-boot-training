package com.springboot.app;

public class Person {
    private int age;
    private String name;
    private Address address;


    public Person(int age, String name, Address address) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.test(this);
    }

    public Person(){

    }

    public void test(Person person){

    }

    public int getAge() {
        return age ;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
