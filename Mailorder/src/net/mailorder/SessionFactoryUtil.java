package net.mailorder;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

    //Singleton instance
    private static SessionFactory sessionFactory;

    /**
     * Builds the session factory for hibernate on the first call
     * @return Returns the singleton instance of the built session factory
     */
    public static SessionFactory getInstance(){
        if(sessionFactory == null){
            SessionFactoryUtil sessionFactoryUtil = new SessionFactoryUtil();
            sessionFactory = sessionFactoryUtil.buildSessionFactory();
        }

        return sessionFactory;
    }

    /**
     *  Takes the Hibernate configuration and builds a session factory out of it
     * @return Returns the built session factory
     */
    private SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }

        return sessionFactory;
    }
}