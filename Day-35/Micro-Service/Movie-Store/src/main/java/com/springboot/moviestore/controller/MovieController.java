package com.springboot.moviestore.controller;

import com.springboot.moviestore.CloudConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private CloudConfig cloudConfig;

    @GetMapping("/message")
    public ResponseEntity<String> getMessage() {
//        return ResponseEntity.ok("Message from Movie Store");
        return ResponseEntity.ok("Message from " + cloudConfig.getUserRole());
    }
}