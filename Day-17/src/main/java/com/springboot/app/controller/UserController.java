package com.springboot.app.controller;

import com.springboot.app.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserController {

    @Autowired
    UserDAO userDAO;
//    UserDAO userDAO = new UserDAO();

    // constructor injection
    //@Autowired
    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    public UserController() {
    }

    //setter injection
    //@Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void getAllUser(){
        userDAO.getAllUser();
    }
    public void getUserById(){
        userDAO.getUserById();
    }

}
