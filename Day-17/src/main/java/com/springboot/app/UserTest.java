package com.beaconfire;


import com.beaconfire.controller.UserController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = ac.getBean("userController",UserController.class);
        userController.getAllUser();
        userController.getUserById();
    }
}
