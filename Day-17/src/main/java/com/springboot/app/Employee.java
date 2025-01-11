package com.springboot.app;

import org.springframework.stereotype.Component;

@Component("rachel")
public class Employee {
    private String name;
    private String email;
    private int gender;

    public Employee() {
        System.out.println("Employee has been created");
    }
}
