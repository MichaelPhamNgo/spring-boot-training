import config.HibernateConfigUtil;
import org.hibernate.Session;

public class OpenSessionVsGetCurrentSessionDemo {
    public static void main(String[] args) {

//        System.out.println(session1==session2);

//        Session session3 = HibernateConfigUtil.openSession();

        Session session1 = HibernateConfigUtil.getCurrentSession();

        System.out.println(session1);

        session1.close();

        Session session2 = HibernateConfigUtil.getCurrentSession();

        System.out.print(session2);


//        Session session4 = HibernateConfigUtil.openSession();


//        session3.close();
//        session4.close();
    }
}
