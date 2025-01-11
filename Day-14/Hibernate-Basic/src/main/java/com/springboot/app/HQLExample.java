package com.springboot.app;

import com.springboot.app.config.HibernateConfigUtil;
import com.springboot.app.domain.QuestionStringOnly;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;

import java.util.List;

public class HQLExample {
    public static void main(String[] args) {
        try(Session session = HibernateConfigUtil.openSession()) {
//            TypedQuery<Question> query = session.createQuery("from Question q where q.question = :placeholder", Question.class);
//            query.setParameter("placeholder", "sample question");
//            List<Question> questionList = query.getResultList();
//            System.out.println(questionList);

            TypedQuery<QuestionStringOnly> query2 = session.createQuery("select new com.springboot.app.domain.QuestionStringOnly(q.question) from Question q", QuestionStringOnly.class);
            List<QuestionStringOnly> list = query2.getResultList();
            System.out.println(list);

        }
    }
}
