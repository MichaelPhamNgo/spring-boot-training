import config.HibernateConfigUtil;
import domain.Question;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FlushEvictClearDemo {
    public static void main(String[] args) {
        Session session = HibernateConfigUtil.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            for (int i = 0; i < 99999999; i++) {
                Question question = new Question("batch question");
                session.save(question);

//                if(i % 100== 0) {
//                   session.flush();
                   session.clear();
//                }
//                session.evict(question);
            }

            // flush + commit
            // flush -> send the updates to the database
            // commit -> make the updates permanent
            tx.commit();
        }
        catch (Exception e) {
            if (tx!=null) tx.rollback();
            throw e;
        }
        finally {
            if (tx!=null) tx.rollback();
            session.close();
        }
    }
}
