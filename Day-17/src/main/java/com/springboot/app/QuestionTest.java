package com.beaconfire;

import com.beaconfire.controller.QuestionController;
import com.beaconfire.controller.UserController;
import com.beaconfire.dao.QuestionDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        System.out.println(ac.getBeansOfType(QuestionDAO.class));


        QuestionController qController = ac.getBean("questionController",QuestionController.class);
        qController.getAllQuestion();
    }
}
