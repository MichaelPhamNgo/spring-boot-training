package com.springboot.app.dao;

public class PersonDao implements IPersonDao{
    @Override
    public void save() {
        System.out.println("Person data saved");
    }
}
