import config.HibernateConfigUtil;
import domain.Question;
import domain.QuestionStringOnly;
import org.hibernate.Session;

import javax.persistence.TypedQuery;
import java.util.List;

public class HQLExample {
    public static void main(String[] args) {
        try(Session session = HibernateConfigUtil.openSession()) {
//            TypedQuery<Question> query = session.createQuery("from Question q where q.question = :placeholder", Question.class);
//            query.setParameter("placeholder", "sample question");
//            List<Question> questionList = query.getResultList();
//            System.out.println(questionList);

            TypedQuery<QuestionStringOnly> query2 = session.createQuery("select new domain.QuestionStringOnly(q.question) from Question q", QuestionStringOnly.class);
            List<QuestionStringOnly> list = query2.getResultList();
            System.out.println(list);

        }
    }
}
