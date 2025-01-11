package com.beaconfire.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDAO {
    public void getAllUser(){
        System.out.println("Get all users");
    }
    public void getUserById(){
        System.out.println("Get User By Id");
    }
}
