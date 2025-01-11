package com.example.logindemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String getHome() {
        return "home";
    }

    @PostMapping("/home")
    public String submitQuestion(@RequestParam(name = "math")String choice, HttpSession session) {
        session.setAttribute("choice", choice);
        return "result";
    }
}
