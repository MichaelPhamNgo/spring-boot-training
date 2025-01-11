package com.springboot.app.controller;


import com.springboot.app.domain.UserResponse;
import com.springboot.app.exception.UserNotFoundException;
import com.springboot.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity<UserResponse> findAll(String res){
        UserResponse userResponse = UserResponse.builder().userList(userService.findAll()).build();
        return new ResponseEntity<>(userResponse,HttpStatus.OK);
    }

    @GetMapping("/user/{name}")
    public ResponseEntity findByName(@PathVariable String name) throws UserNotFoundException {
//        too many try catch block
//        try{
//            UserResponse userResponse = UserResponse.builder().userList(userService.findByName(name)).build();
//            return new ResponseEntity(userResponse,HttpStatus.OK);
//        }catch (UserNotFoundException e){
//            return new ResponseEntity(ErrorMessage.builder().msg(e.getMessage()+" Not Found").build(),HttpStatus.BAD_REQUEST);
//        }
//
        UserResponse userResponse = UserResponse.builder().userList(userService.findByName(name)).build();
        return new ResponseEntity<>(userResponse,HttpStatus.OK);

    }

}
