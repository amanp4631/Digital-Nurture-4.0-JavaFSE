package com.hibernateexample.app;

import com.hibernateexample.dao.CountryDAO;
import com.hibernateexample.model.Country;

public class AppMain {
    public static void main(String[] args) {
        CountryDAO dao = new CountryDAO();

        Country newCountry = new Country();
        newCountry.setCode("NP");
        newCountry.setName("Nepal");

        dao.addCountry(newCountry);

        Country fetchedCountry = dao.getCountryByCode("NP");
        System.out.println("Fetched: " + fetchedCountry);
    }
}