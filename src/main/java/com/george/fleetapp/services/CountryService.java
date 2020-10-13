package com.george.fleetapp.services;

import com.george.fleetapp.models.Country;
import com.george.fleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    //Returns list of countries
    public List<Country> getCountries(){
        return countryRepository.findAll();
    }

    //save country
    public void save(Country country){
        countryRepository.save(country);
    }
}
