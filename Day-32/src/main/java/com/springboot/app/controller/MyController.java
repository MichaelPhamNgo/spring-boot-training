package com.springboot.app.controller;

import com.springboot.app.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("async")
    public ResponseEntity asyncCall(){
        return ResponseEntity.ok(myService.asyncCall());
    }

}
