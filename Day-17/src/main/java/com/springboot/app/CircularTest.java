package com.beaconfire;

import com.beaconfire.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        CircularA a = ac.getBean("a",CircularA.class);
        System.out.println(a.b);
    }
}
