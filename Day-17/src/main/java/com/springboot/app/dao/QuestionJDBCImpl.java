package com.springboot.app.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class QuestionJDBCImpl implements QuestionDAO{
    @Override
    public void getAllQuestion() {
        System.out.println("JDBC Implementation");
    }
}
