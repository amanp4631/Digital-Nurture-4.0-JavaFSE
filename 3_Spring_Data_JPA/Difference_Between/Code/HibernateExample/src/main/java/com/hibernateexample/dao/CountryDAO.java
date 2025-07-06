package com.hibernateexample.dao;


import com.hibernateexample.model.Country;
import com.hibernateexample.util.HibernateUtil;
import org.hibernate.*;

public class CountryDAO {
    public void addCountry(Country country) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(country);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public Country getCountryByCode(String code) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Country country = session.get(Country.class, code);
        session.close();
        return country;
    }
}