package com.springboot.app.controller;


import com.springboot.app.domain.User;
import com.springboot.app.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
public class LoginController {
    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/")
    public String postLogin(@RequestParam String username, @RequestParam String password, HttpServletRequest request) {
        Optional<User> possibleUser = loginService.validateLogin(username, password);
        if(possibleUser.isPresent()) {
            HttpSession oldSession = request.getSession(false);
            if(oldSession != null) {
                oldSession.invalidate();
            }
            HttpSession newSession = request.getSession(true);
            newSession.setAttribute("user", possibleUser.get());
            return "home";
        } else {
            return "login";
        }
    }
}
