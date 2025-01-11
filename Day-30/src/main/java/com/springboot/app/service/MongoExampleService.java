package com.springboot.app.service;


import com.springboot.app.dao.MongoRepositoryExample;
import com.springboot.app.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoExampleService {
    private MongoRepositoryExample repository;

    public MongoExampleService(MongoRepositoryExample repository) {
        this.repository = repository;
    }

    public User findUserByUsername(String username) {
        return repository.findUserByUsername(username).get(0);
    }

    public void saveOrUpdateUser(User user) {
        repository.save(user);
    }

    public List<User> findUserByPassword(String password) {
        return repository.findUserByPassword(password);
    }
}
