package com.example.springmvcdemojan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/jack")
public class TestController {

    @GetMapping(path = "/hello/{id}")
    public String helloWorld(Model model, @PathVariable String id, @RequestParam(required = false) Optional<String> name) {
        model.addAttribute("helloString", "Hello World");
        model.addAttribute("id", id);
        model.addAttribute("name", name.orElse("name not entered"));
        return "helloWorld";
    }

    @PostMapping("/user")
    @ResponseBody
    public User getUser(@RequestBody User user) {
        return user;
    }
}
