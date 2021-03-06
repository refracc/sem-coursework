package com.napier.sem;

import com.napier.sem.util.DatabaseManager;
import com.napier.sem.util.Queries;


/**
 * <h1>SEM Coursework</h1>
 * <p>Program to provide a simple source of population data.</p>
 *
 * @author Group 16
 * @version 0.1.0.2
 * @since 2020/27/01
 */
public class App {

    public static void main(String[] args) {
        DatabaseManager dbm = DatabaseManager.getInstance();
        Queries query = new Queries();

        dbm.connect(10, 3306, "world", "root", "example", false);
        dbm.populate();
        dbm.disconnect();

        query.worldCountries();
        query.countriesInContinent("Asia");
        query.countriesInRegion("Southern Europe");
        query.topPopulatedCountries(5);
        query.topPopulatedCountriesInContinent(7, "Europe");
        query.topPopulatedCountriesInRegion(4, "Eastern Europe");
    }
}
