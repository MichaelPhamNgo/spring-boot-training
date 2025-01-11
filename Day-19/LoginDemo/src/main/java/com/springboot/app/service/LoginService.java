package com.example.logindemo.service;

import com.example.logindemo.dao.LoginDao;
import com.example.logindemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    private LoginDao loginDao;

    @Autowired
    public LoginService(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

    public Optional<User> validateLogin(String username, String password) {
        return loginDao.validateLogin(username, password);
    }
}
