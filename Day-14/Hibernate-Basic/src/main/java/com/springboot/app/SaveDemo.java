package com.springboot.app;

import com.springboot.app.config.*;
import com.springboot.app.domain.Question;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveDemo {
    public static void main(String[] args) {
        Session session = HibernateConfigUtil.openSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Question question = new Question("sample question");

//            ways to save a new instance in Hibernate
//            session.persist(question);

//            Integer id = (Integer) session.save(question);
//            System.out.println(id);

            Question question1 = (Question) session.merge(question);
            System.out.println(question1.getId());

//            session.saveOrUpdate(question);

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
}
