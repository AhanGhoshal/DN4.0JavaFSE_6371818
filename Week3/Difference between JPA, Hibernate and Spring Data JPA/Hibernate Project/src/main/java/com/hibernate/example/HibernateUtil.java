package com.hibernate.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}
