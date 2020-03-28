package com.rajkonkret.countriesdocker.repository;

import com.rajkonkret.countriesdocker.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

    Country findByCode(String code);
}
