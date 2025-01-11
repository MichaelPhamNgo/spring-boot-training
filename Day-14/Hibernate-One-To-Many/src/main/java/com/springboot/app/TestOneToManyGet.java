import config.HibernateConfigUtil;
import domain.Choice;
import domain.Question;
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

