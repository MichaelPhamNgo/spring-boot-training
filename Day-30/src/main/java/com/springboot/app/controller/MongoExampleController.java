package com.springboot.app.controller;


import com.springboot.app.domain.User;
import com.springboot.app.service.MongoExampleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value = "Rest endpoints")
public class MongoExampleController {
    private final MongoExampleService service;

    @Autowired
    public MongoExampleController(MongoExampleService service) {
        this.service = service;
    }

    @GetMapping(value = "/user", params = "username")
    @ApiOperation(value = "Find user by the username", response = User.class)
    public User findUserByUsername(@RequestParam String username) {
        return service.findUserByUsername(username);
    }

    @PostMapping("/user")
    @ApiOperation(value = "Save or update the user")
    public void saveOrUpdateUser(@RequestBody User user) {
        service.saveOrUpdateUser(user);
    }

    @GetMapping(value = "/user-password", params = "password")
    @ApiOperation(value = "Find user by the password", response = Iterable.class)
    public List<User> findUserByPassword(String password) {
        return service.findUserByPassword(password);
    }
}
