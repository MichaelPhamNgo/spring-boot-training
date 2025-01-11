package com.springboot.app.service;


import com.springboot.app.dao.UserDAO;
import com.springboot.app.exception.SomeException;
import com.springboot.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public List<User> getUser(){
        return userDAO.getUser();
    }

    public void throwException() throws SomeException {
        throw new SomeException();
    }

    public User saveUser(User user){
        return userDAO.saveUser(user);
    }
}
