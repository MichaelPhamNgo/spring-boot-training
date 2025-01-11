package com.springboot.app;

import com.springboot.app.config.HibernateConfigUtil;
import com.springboot.app.domain.Choice;
import com.springboot.app.domain.Question;
import org.hibernate.*;

public class TestOneToManyGet {
    public static void main(String[] args) {

        Question question = null;
        try (Session session = HibernateConfigUtil.openSession()) {
//            Transaction transaction = null;
//            transaction = session.beginTransaction();

            question = session.get(Question.class, 3);
//            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(question != null) {
            System.out.println(question);
            for(Choice c : question.getChoices()) {
                System.out.println(c);
            }
        }
    }
}

