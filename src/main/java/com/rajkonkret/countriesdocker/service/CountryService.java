package com.rajkonkret.countriesdocker.service;

import com.rajkonkret.countriesdocker.model.Country;
import com.rajkonkret.countriesdocker.repository.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;

    public Country getCountry(String code) {
        return countryRepository.findByCode(code);
    }
}
