import config.HibernateConfigUtil;
import domain.City;
import org.hibernate.*;

public class TestGet {
    public static void main(String[] args) {

        try (Session session = HibernateConfigUtil.openSession()) {
            Transaction transaction = null;
            transaction = session.beginTransaction();
            City city = session.get(City.class, 1);
            System.out.println(city);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
