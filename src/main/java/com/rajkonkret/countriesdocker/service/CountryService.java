package com.rajkonkret.countriesdocker.service;

import com.rajkonkret.countriesdocker.repository.CountryRepository;
import org.graalvm.compiler.serviceprovider.ServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class CountryService {
    @Autowired
    CountryRepository counryRepository;

}
