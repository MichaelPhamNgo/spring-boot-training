import config.HibernateConfigUtil;
import domain.Question;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.query.*;
import java.util.List;

public class HQLExample {
    public static void main(String[] args) {
        List<Question> questions = null;
        try (Session session = HibernateConfigUtil.openSession()) {
            Transaction transaction = null;
            transaction = session.beginTransaction();
            Query<Question> query = session.createQuery("from Question question join fetch question.choices choices", Question.class);
            questions = query.list();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(questions);
    }
}
