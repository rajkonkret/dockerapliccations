package com.rajkonkret.countriesdocker.controller;

import com.rajkonkret.countriesdocker.model.Country;
import com.rajkonkret.countriesdocker.model.CountryAPI;
import com.rajkonkret.countriesdocker.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {
    @Autowired
    CountryService countryService;

    @GetMapping("/{code}")
    public CountryAPI getCountryInfo(@PathVariable String code){
        Country country = countryService.getCountry(code);

        List<String> list = new ArrayList<>();
        list.add("PL");

        return new CountryAPI(
                country.getName(),
                country.getContinent(),
                country.getPopulation(),
                country.getLifeExpectancy(),
                list        );
    }
}
