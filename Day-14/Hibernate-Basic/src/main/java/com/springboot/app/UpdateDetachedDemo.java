package com.springboot.app;

import com.springboot.app.config.*;
import com.springboot.app.domain.Question;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateDetachedDemo {
    public static void main(String[] args) {
        Session session = HibernateConfigUtil.openSession();

        Transaction tx = null;
        Question question = null;
        try {
            tx = session.beginTransaction();

            question = session.get(Question.class, 559037);

//            move to detached state
            session.evict(question);
//            changes to this instance will no longer be persisted in database
            question.setQuestion("change after eviction");
//            you must use one of the methods that move the entity from detached to persistent
            session.update(question);
//            session.saveOrUpdate(question);

            //merge is different from the update methods but it generally accomplishes the same purpose
//            SerializeUtils.serialization(question);
//            Question question1 = (Question) SerializeUtils.deserialization();
//            question1.setQuestion("Updated question from merge");
//            Question updatedQuestion = (Question) session.merge(question1);
//            System.out.println(question == question1);

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
}
