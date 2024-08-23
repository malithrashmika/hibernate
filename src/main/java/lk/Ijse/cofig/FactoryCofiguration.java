package lk.Ijse.cofig;


import lk.Ijse.entity.Student;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class FactoryCofiguration {
    private static FactoryCofiguration factoryCofiguration;
    private SessionFactory sessionFactory;
    private FactoryCofiguration() {
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
        sessionFactory=configuration.buildSessionFactory();
    }
    public static FactoryCofiguration getInstance() {
        return (factoryCofiguration==null)?factoryCofiguration=new FactoryCofiguration():factoryCofiguration;
    }
    public Session getSession() {
        return sessionFactory.openSession();
    }
}
