package com.springboot.app.service;

import com.springboot.app.dao.UserDAO;
import com.springboot.app.domain.User;
import com.springboot.app.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public List<User> findAll(){
        return userDAO.findAll();
    }

    public List<User> findByName(String name) throws UserNotFoundException {
        List<User> res = userDAO.findByName(name);
        if(res.isEmpty()){
            throw new UserNotFoundException(name);
        }
        return res;
    };
}
