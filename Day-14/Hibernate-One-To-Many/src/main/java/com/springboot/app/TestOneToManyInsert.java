import config.HibernateConfigUtil;
import domain.Choice;
import domain.Question;
import org.hibernate.*;

public class TestOneToManyInsert {
    public static void main(String[] args) {

        try (Session session = HibernateConfigUtil.openSession()) {
            Transaction transaction = null;
            transaction = session.beginTransaction();
            Question question = new Question();
            question.setQuestion("What is 1 + 1");

            Choice choice = new Choice();
            choice.setChoice("1");

            Choice choice2 = new Choice();
            choice2.setChoice("2");

            Choice choice3 = new Choice();
            choice3.setChoice("3");

            Choice choice4 = new Choice();
            choice4.setChoice("4");

            question.addChoice(choice);
            question.addChoice(choice2);
            question.addChoice(choice3);
            question.addChoice(choice4);

            session.saveOrUpdate(question);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
