package com.hibernate.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDao {
    public Integer addEmployee(Employee emp) {
        Transaction tx = null;
        Integer id = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            id = (Integer) session.save(emp);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }

        return id;
    }
}
