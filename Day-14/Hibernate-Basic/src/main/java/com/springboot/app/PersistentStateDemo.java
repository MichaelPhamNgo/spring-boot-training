package com.springboot.app;

import com.springboot.app.config.HibernateConfigUtil;
import com.springboot.app.domain.Question;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersistentStateDemo {
    public static void main(String[] args) {
        Session session = HibernateConfigUtil.openSession();

        Transaction tx = null;
        Question question = null;
        try {
            tx = session.beginTransaction();

            question = session.get(Question.class, 559037);
            question.setQuestion("updated question");

            tx.commit();

            Transaction tx2 = session.beginTransaction();
            question.setQuestion("updated question 2");
            tx2.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
}
