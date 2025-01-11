import config.*;
import domain.Question;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GetVsLoadDemo {
    public static void main(String[] args) {
        Session session = HibernateConfigUtil.openSession();

        Transaction tx = null;
        Question question= null;
        try {
            tx = session.beginTransaction();

//             get vs load, get is eager initialization while load is lazily initialization
//            question = session.load(Question.class, 3);
            Hibernate.initialize(question);
//            question = session.get(Question.class, 3);

            // get vs load, when the record is not found
            question = session.load(Question.class, 1000);
//            Hibernate.initialize(question);
//            question = session.get(Question.class, 1000);
//            System.out.println(question);


            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            throw e;
        } finally {
            session.close();
        }
        System.out.println(question);
    }
}
