package com.rajkonkret.countriesdocker.service;

import com.rajkonkret.countriesdocker.model.CountryLanguage;
import com.rajkonkret.countriesdocker.repository.CountryLanguageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryLanguageService {

    private CountryLanguageRepository countryLanguageRepository;

    public CountryLanguageService(CountryLanguageRepository countryLanguageRepository){
        this.countryLanguageRepository = countryLanguageRepository;
    }

    public List<CountryLanguage> getCountryLanguages(String code) {
        return countryLanguageRepository.findByCountryCode(code);
    }
}
