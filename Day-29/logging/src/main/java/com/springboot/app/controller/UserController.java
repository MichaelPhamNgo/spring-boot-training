package com.springboot.app.controller;

import com.springboot.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ResponseEntity getUsers(){
        return ResponseEntity.ok(userService.getUser());
    }

    @GetMapping("/userA")
    public ResponseEntity getUserA(){
        return ResponseEntity.ok(userService.getUser().stream().filter((user)->user.getUsername().equals("fan")).findAny().get());
    }

}
