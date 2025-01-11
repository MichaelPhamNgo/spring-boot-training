package com.springboot.app.controller;


import com.springboot.app.service.TestService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TestService testService;

    @GetMapping("/test")
    public ResponseEntity test(){
        log.trace("controller trace");
        log.debug("controller debug");
        log.info("controller info");
        log.warn("controller warn");
        log.error("controller error");

        for (int i = 0; i < 10000; i++) {
            log.error("size++");
        }
        testService.test();

        return ResponseEntity.ok("TEST");
    }

}
