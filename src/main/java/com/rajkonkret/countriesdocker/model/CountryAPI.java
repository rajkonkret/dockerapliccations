package com.rajkonkret.countriesdocker.model;

import java.util.List;

public class CountryAPI {

        private String name;
        private String continent;
        private Integer population;
        private Integer lifeExpectancy;
        private List<CountryLanguage> countryLanguage;

    public CountryAPI(String name, String continent, Integer population, Integer lifeExpectancy, List<CountryLanguage> countryLanguage) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.countryLanguage = countryLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(Integer lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public List<CountryLanguage> getCountryLanguage() {
        return countryLanguage;
    }

    public void setCountryLanguage(List<CountryLanguage> countryLanguage) {
        this.countryLanguage = countryLanguage;
    }
}
