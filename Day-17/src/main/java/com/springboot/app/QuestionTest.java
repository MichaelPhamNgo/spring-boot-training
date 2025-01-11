package com.springboot.app;


import com.springboot.app.controller.QuestionController;
import com.springboot.app.dao.QuestionDAO;
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
