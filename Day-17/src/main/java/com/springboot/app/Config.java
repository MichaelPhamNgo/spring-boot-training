package com.springboot.app;


import com.springboot.app.dao.QuestionDAO;
import com.springboot.app.dao.QuestionHibernateImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public QuestionDAO anotherImpl(){
        return new QuestionHibernateImpl();
    }
}
