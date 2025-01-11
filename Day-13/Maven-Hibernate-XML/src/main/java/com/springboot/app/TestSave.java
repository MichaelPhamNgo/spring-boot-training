package com.springboot.app;

import com.springboot.app.config.HibernateConfigUtil;
import com.springboot.app.domain.City;
import org.hibernate.*;

public class TestSave {
    public static void main(String[] args) {

        try (Session session = HibernateConfigUtil.openSession()) {
            Transaction transaction = null;
            transaction = session.beginTransaction();
            City city = new City();
            city.setName("New City");
            city.setDistrict("New District");
            city.setCountryCode("AFG");
            city.setPopulation(10);
            session.saveOrUpdate(city);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
