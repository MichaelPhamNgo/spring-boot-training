package com.springboot.app.dao;

import org.springframework.stereotype.Component;

@Component
public class QuestionHibernateImpl implements QuestionDAO{
    @Override
    public void getAllQuestion() {
        System.out.println("Hibernate Implementation");
    }
}
