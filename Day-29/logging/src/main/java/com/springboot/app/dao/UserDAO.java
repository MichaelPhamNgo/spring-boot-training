package com.springboot.app.dao;

import com.springboot.app.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserDAO {
    static List<User> list = null;


    public List<User> getUser(){
        return Arrays.asList(
                new User(1,"fan","fan@fan.com"),
                new User(2,"rachel","rachel@rachel.com"),
                new User(3,"martin","martin@martin.com"));
    }

    public User saveUser(User user){
        return user;
    }

}
