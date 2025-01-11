package com.beaconfire.controller;

import com.beaconfire.dao.QuestionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class QuestionController {
    @Autowired
//    @Qualifier("questionHibernateImpl")
    //QuestionDAO questionDAO;

    QuestionDAO anotherImpl;

    public void getAllQuestion(){
        //questionDAO.getAllQuestion();
        anotherImpl.getAllQuestion();
    }
}
