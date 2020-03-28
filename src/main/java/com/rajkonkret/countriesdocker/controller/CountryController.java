package com.rajkonkret.countriesdocker.controller;

import com.rajkonkret.countriesdocker.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    @GetMapping("/{code}")
    public String getCountryInfo(@PathVariable String code){
        Country country = new Country();

    }
}
