package com.example.usersrestapi.controllers;

import com.example.usersrestapi.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UsersController {
    private static final List<User> users;

    static {
        users = new ArrayList<>();
        users.add(new User("Jack", "jack"));
        users.add(new User("Kyle", "kyle"));
        users.add(new User("Alice", "alice"));
    }

    @GetMapping("/user")
    public List<User> getAllUsers() {
        return users;
    }

    @PostMapping("/user")
    public String addUser(@RequestBody User user) {
        System.out.println(user.getUsername());
        users.add(user);
        return "user added";
    }
}
