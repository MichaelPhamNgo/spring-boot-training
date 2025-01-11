package com.springboot.app.controller;


import com.springboot.app.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public ResponseEntity<String> executionTime(){
        System.out.println("-----Executing Controller Layer-----");
        String res = testService.test();
        return ResponseEntity.ok(res);
    }

    @GetMapping("/age/{age}")
    public ResponseEntity<String> testException(@PathVariable Integer age) throws Exception {
        if(age<=0)
            throw new Exception("age should be a positive number");
        else
            return ResponseEntity.ok("Input Age: "+age);
    }

}
