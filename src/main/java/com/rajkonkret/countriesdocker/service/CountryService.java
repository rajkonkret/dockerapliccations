package com.rajkonkret.countriesdocker.service;

import com.rajkonkret.countriesdocker.model.Country;
import com.rajkonkret.countriesdocker.repository.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class CountryService {
    @Autowired
    CountryRepository counryRepository;

    public Country getCountry(String code) {
        return counryRepository.findByCode(code);
    }
}
