package com.springboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello-world")
    public ModelAndView helloWorld(Model model) {
        model.addAttribute("hello", "Hello World!");
        return new ModelAndView("helloWorld");
    }
}
