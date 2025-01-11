package com.beaconfire;

import com.beaconfire.dao.QuestionDAO;
import com.beaconfire.dao.QuestionHibernateImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public QuestionDAO anotherImpl(){
        return new QuestionHibernateImpl();
    }
}
